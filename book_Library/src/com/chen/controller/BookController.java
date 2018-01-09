package com.chen.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.chen.entity.User;
import com.chen.entity.book.Book;
import com.chen.server.UserServer;
import com.chen.server.book.BookServer;

@Controller
public class BookController 
{
	private BookServer bookServer;
	private UserServer userServer;
	public void setUserServer()
	{
	@SuppressWarnings("resource")
	ApplicationContext c=new ClassPathXmlApplicationContext("applicationContext.xml");
	this.userServer=(UserServer)c.getBean("userServer");
	}
	
	public void setBookServer()
	{
		@SuppressWarnings("resource")
		ApplicationContext c=new ClassPathXmlApplicationContext("applicationContext.xml");
		this.bookServer=(BookServer)c.getBean("bookServer");
	}
	/*
	 * �û������鼮��Ϣ
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/user/find")
	public String find_book(Model model)
	{
		this.setBookServer();
		List<Book> books=this.bookServer.getAllBook();
		model.addAttribute("books", books);
		return "book/bookList_user";
	}
	/*
	 * �û�����
	 */
	@RequestMapping("/{book_id}/borrow")
	public String borrow(Model model,@PathVariable String book_id)
	{
		model.addAttribute("id",book_id);
		return "book/borrow_user";
	}
	@RequestMapping(value="/update/user",method=RequestMethod.POST)
	public String update_user(Model model,@RequestParam String borrow_date,
			@RequestParam String return_date,
			@RequestParam String book_id,HttpSession session)
	{
		
		System.out.println(borrow_date);
		this.setBookServer();
		this.bookServer.updateInfo(book_id.trim(),"�ѽ���", "��", java.sql.Date.valueOf(borrow_date.trim()),"��", java.sql.Date.valueOf(return_date.trim()),(String)session.getAttribute("username"));
		return "redirect:/user/find";
	}
	/*
	 * ��ʾ�û����ĵ���Ϣ
	 */
	@RequestMapping("/borrow/user")
	public String getSellInfo(HttpSession session,Model model)
	{
		this.setBookServer();
		model.addAttribute("borrow_info",this.bookServer.getSelfInfo((String)session.getAttribute("username")));
		return "user/borrow_list";
	}
	/*
	 * ����Ա
	 */
	/*
	 * ��ʾͼ�����Ϣ
	 */
	@RequestMapping("/show/manager")
	public String show(Model model)
	{
		this.setBookServer();
		model.addAttribute("library",this.bookServer.getAllBook());
		return "manager/show_list";
	}
	/*
	 * ����Ա����ת�����ͼ�����
	 */
	@RequestMapping("/toadd/manager")
	public String toaddBook()
	{
		return "manager/addBook";
	}
	/*
	 * ����Ա�����ͼ��
	 */
	@RequestMapping(value="/add/manager",method=RequestMethod.POST)
	public String addBook(Model model,@RequestParam String book_id,
			@RequestParam String book_name,
			@RequestParam String book_author,
			@RequestParam String book_press,
			@RequestParam String book_date)
	{
		this.setBookServer();
		this.bookServer.insertInfo_manager(book_id.trim(), book_name.trim(), book_author.trim(), book_press.trim(), java.sql.Date.valueOf(book_date),"�ڼ�");
		return "redirect:/show/manager";
	}
	/*
	 * ����Ա���޸�ͼ��
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/{book_id}/alter")
	public String alter_book(@PathVariable String book_id,Model model)
	{
		this.setBookServer();
		List<Book> books=this.bookServer.getInfoByID_manager(book_id.trim());
		model.addAttribute("alter",books);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String date=format.format(books.get(0).getBook_date());
		model.addAttribute("date", date);
		return "manager/book_alter";
	}
	/*
	 * ����Ա���޸�ͼ�鲢����
	 */
	@RequestMapping(value="/alter/manager" ,method=RequestMethod.POST)
	public String alter_save(Model model,@RequestParam String book_id,
			@RequestParam String book_name,
			@RequestParam String book_author,
			@RequestParam String book_press,
			@RequestParam String book_date
			)
	{
		this.setBookServer();
		this.bookServer.updateInfo_manager(book_id.trim(), book_name.trim(), book_author.trim(), book_press.trim(), java.sql.Date.valueOf(book_date.trim()));
		return "redirect:/show/manager";
	}
	/*
	 * ����Ա��ɾ��ͼ��
	 */
	@RequestMapping("/{book_id}/delete/manager")
	public String delete(@PathVariable String book_id)
	{
		this.setBookServer();
		this.bookServer.deleteInfo_manager(book_id.trim());
		return "redirect:/show/manager";
	}
	/*
	 * ����Ա��ѧ����Ϣչʾ
	 */
	@RequestMapping("/show_user/manager")
	@SuppressWarnings("unchecked")
	public String user_list(Model model)
	{
		this.setUserServer();
		List<User> users=this.userServer.getAllInfo();
		model.addAttribute("users", users);
		return "manager/user_list";
	}
	/*
	 * ����Ա��ɾ��ѧ����Ϣ
	 */
	@RequestMapping("/{username}/delete")
	public String delete_user(@PathVariable String username)
	{
		this.setUserServer();
		this.userServer.delete_Info(username.trim());
		return "redirect:/show_user/manager";
	}
	/*
	 * ����Ա����ʾ���ĵ���Ϣ
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/show_borrow/manager")
	public String show_borrow(Model model)
	{
		
		this.setBookServer();
		this.setUserServer();
		List<Book> books=this.bookServer.getInfoByState("�ѽ���");
		List<User> users=this.userServer.getAllInfo();
		for(int i=0;i<books.size();i++)
		{
			for(int j=0;j<users.size();j++)
			{
				if(books.get(i).getUser_id().equals(users.get(j).getUsername()))
				{
					books.get(i).setUser(users.get(j));
				}
			}
		}
		model.addAttribute("bbook", books);
		return "manager/show_borrow";
	}
	/*
	 * ����Ա���黹�Ĳ���
	 */
	@RequestMapping("/{book_id}/back/manager")
	public String book_back(@PathVariable String book_id)
	{
		this.setBookServer();
		this.bookServer.updateState_manager(book_id.trim(),"�ڼ�",null, java.sql.Date.valueOf("9999-01-01"), null,  java.sql.Date.valueOf("9999-01-01"), null);
		return "redirect:/show_borrow/manager";
	}
}
