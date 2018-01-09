package com.chen.controller;

import javax.servlet.http.HttpSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.chen.entity.Manager;
import com.chen.entity.User;
import com.chen.server.ManagerServer;
import com.chen.server.UserServer;

/**
 * @author 陈强
 *
 */

@Controller
public class LoginController {
	private UserServer userServer;
	private ManagerServer managerServer;
	public void setManagerServer()
	{
		@SuppressWarnings("resource")
		ApplicationContext c=new ClassPathXmlApplicationContext("applicationContext.xml");
		this.managerServer=(ManagerServer)c.getBean("managerServer");
	}
	public void setUserServer()
	{
	@SuppressWarnings("resource")
	ApplicationContext c=new ClassPathXmlApplicationContext("applicationContext.xml");
	this.userServer=(UserServer)c.getBean("userServer");
	}
	
	@RequestMapping("/toLogin")
	public String toLogin()
	{
		return "Login";
	}
	
	@RequestMapping(value="/toRegister",method=RequestMethod.GET)
	public String toRegister()
	{
		return "Register";
	}
	
	@RequestMapping("/topFrame")
	public String topFrame()
	{
		return "user/topFrame";
	}
	@RequestMapping("/homepage")
	public String homepage()
	{
		return "user/homepage";
	}
	@RequestMapping("/TopFrame")
	public String TopFrame()
	{
		return "manager/TopFrame";
	}
	
	/**
	 * @param model
	 * @param username
	 * @param password
	 * @param realname
	 * @param telephone
	 * @param sex
	 * @param idCard
	 * @param type
	 * @return
	 */
	@RequestMapping(value="/register/user",method=RequestMethod.POST)
	public String register(Model model,
			@RequestParam("username")String username,
			@RequestParam("password")String password,
			@RequestParam("realname")String realname,
			@RequestParam("telephone")String telephone,
			@RequestParam("sex")String sex,
			@RequestParam("idcard")String idCard,
			@RequestParam("type")String type)
	{
		if(type.equals("consumer"))
		{
			User user=new User( username, password,  realname,  telephone,  sex, idCard);
			this.setUserServer();
			userServer.inserInfo(user);
			model.addAttribute(user.getUsername(), user);
			
		}
		if(type.equals("manager"))
		{
			Manager user=new Manager( username, password,  realname,  telephone,  sex, idCard);
			this.setManagerServer();
			this.managerServer.inserInfo(user);
			model.addAttribute(user.getUsername(), user);
		}
		
		
		return "redirect:/toLogin";
	}
	
	@RequestMapping(value="/login/user",method=RequestMethod.POST)
	public String login(Model model,
			 @RequestParam("username") String username,
			@RequestParam("password")String password,	
			@RequestParam("type")String type,HttpSession session)
	{
		if(username==null||username.equals(""))
		{
			model.addAttribute("username","error");
			return "Login";
		}
		if(type.equals("consumer"))
		{
			this.setUserServer();
			if(this.userServer.checkInfo(username, password))
			{
				session.setAttribute("username", username);
				return "user/usermain";
			}
		}
		if(type.equals("manager"))
		{
			this.setManagerServer();
			if(this.managerServer.checkInfo(username, password))
			{
				session.setAttribute("username", username);
				return "manager/managermain";
			}
		}
		return "redirect:/toLogin";
	}
	/*
	 * 显示用户自己的信息
	 */
	@RequestMapping("/myself/user")
	public String getmyselfInfo(Model model,HttpSession session)
	{
		this.setUserServer();
		model.addAttribute("self",this.userServer.getInfobyID((String)session.getAttribute("username")));
		return "user/user_self";
	}

}
