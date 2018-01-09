package com.chen.DAO.book;

import java.util.Date;
import java.util.List;

public interface IBookDAO 
{
	/*
	 * �õ�ͼ���������Ϣ
	 */
	@SuppressWarnings("rawtypes")
	public List getAllBook();
	/*
	 * �û��õ��Լ��Ľ�����Ϣ
	 */
	@SuppressWarnings("rawtypes")
	public List getSelfInfo(String user_id);
	/*
	 * ������Ϣ:����ͼ���id�����������Ϣ
	 * 
	 */
	public int updateInfo(String book_id,String book_state,String book_borrow,Date borrow_date,String book_return,Date return_date,String user_id);
	
	/*
	 * ����Ա��¼����Ϣ
	 */
	public int insertInfo_manager(String book_id, String book_name, String book_author, String book_press, Date book_date,
			String book_state);
	/*
	 * ����Ա��ɾ��ͼ����Ϣ
	 */
	public int deleteInfo_manager(String book_id);
	/*
	 * ����Ա������ͼ����Ϣ���ı�����״̬
	 */
	public int updateInfo_manager(String book_id, String book_name, String book_author, String book_press, Date book_date);
	/*
	 * ����Ա������ͼ����Ϣ�ı�����״̬
	 */
	public int updateState_manager(String book_id,String book_state,String book_borrow,Date borrow_date,String book_return,Date return_date,String user_id);
	/*
	 * ����Ա������id�������鱾��Ϣ
	 */
	@SuppressWarnings("rawtypes")
	public List getInfoByID_manager(String book_id);
	/*
	 * ����Ա�������鱾״̬�������еĽ�����Ϣ
	 */
	@SuppressWarnings("rawtypes")
	public List getInfoByState(String book_state);
}
