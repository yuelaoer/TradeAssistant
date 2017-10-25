package com.ta.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.ta.bean.Customer;

public class BatisClient
{
	private static BatisClient instance;
	
	private static SqlSessionFactory factory;
	
	private final static Logger DEBUGGER = Logger.getLogger("ta");
	
	private BatisClient() throws IOException
	{
		factory = new SqlSessionFactoryBuilder()
		.build(Resources.getResourceAsStream("conf/mybatis-config.xml"));
	}
	
	public static BatisClient getInstance() throws Exception
	{
		if(null == instance)
		{
			instance = new BatisClient();
		}
		return instance;
	}
	
	/**
	 * 查询客户
	 * @param cust
	 * @return
	 * @throws Exception
	 */
	public List<Customer> queryCustomer(Customer cust) throws Exception
	{
		SqlSession session = factory.openSession();
		CustLinkmanDao dao = session.getMapper(CustLinkmanDao.class);
		List<Customer> list = null;
		try
		{
			list = dao.queryCustomer(cust);			
		} catch (Exception e)
		{
			DEBUGGER.error(e.getMessage(), e);
			throw e;
		}
		finally
		{
			session.close();	
			return list;
		}		
	}
	
	/**
	 * 新增客户
	 * @param cust
	 * @throws Exception
	 */
	public void addCustomer(Customer cust) throws Exception
	{
		SqlSession session = factory.openSession();
		CustLinkmanDao dao = session.getMapper(CustLinkmanDao.class);
		try
		{
			dao.addCustomer(cust);
		}
		catch(Exception e)
		{
			DEBUGGER.error(e.getMessage(), e);
			throw e;
		}
		finally
		{
			session.close();
		}
	}
	
	/**
	 * 更新客户
	 * @param cust
	 * @throws Exception
	 */
	public void updateCustomer(Customer cust) throws Exception
	{
		SqlSession session = factory.openSession();
		CustLinkmanDao dao = session.getMapper(CustLinkmanDao.class);
		try
		{
			dao.updateCustomer(cust);
		}
		catch(Exception e)
		{
			DEBUGGER.error(e.getMessage(), e);
			throw e;
		}
		finally
		{
			session.close();
		}
	}
	
	/**
	 * 删除客户（只根据id）
	 * @param cust
	 * @throws Exception
	 */
	public void deleteCustomer(Customer cust) throws Exception
	{
		SqlSession session = factory.openSession();
		CustLinkmanDao dao = session.getMapper(CustLinkmanDao.class);
		try
		{
			dao.deleteCustomer(cust);
		}
		catch(Exception e)
		{
			DEBUGGER.error(e.getMessage(), e);
			throw e;
		}
		finally
		{
			session.close();
		}
	}
}
