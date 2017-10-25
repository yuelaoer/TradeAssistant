package com.ta.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.ta.bean.Customer;
import com.ta.dao.BatisClient;

public class CustService
{
	private static final Logger DEBUGGER = Logger.getLogger("ta");
	/**
	 * 新建客户
	 * @param cust
	 * @throws Exception 
	 */
	public void addCustomer(Customer cust) throws Exception
	{
		if( null == cust)
		{
			DEBUGGER.error("Failed to add Cust!Caused by cust is null!");
			throw new Exception("Failed to add Cust!Caused by cust is null!");
		}
		BatisClient.getInstance().addCustomer(cust);
	}
	
	/**
	 * 删除客户
	 * @param cust
	 * @throws Exception 
	 */
	public void deleteCustomer(Customer cust) throws Exception
	{
		if( null == cust)
		{
			throw new Exception("Failed to delete Cust!Caused by cust is null!");
		}
		if( 0 >= cust.getId())
		{
			throw new Exception("Failed to delete Cust!Caused by custId <= 0!");
		}
		BatisClient.getInstance().deleteCustomer(cust);
	}
	
	/**
	 * 更新客户信息
	 * @param cust
	 * @throws Exception 
	 */
	public void updateCustomer(Customer cust) throws Exception
	{
		if( null == cust)
		{
			throw new Exception("Failed to update Cust!Caused by cust is null!");
		}
		if( null == this.queryCustomerById(cust.getId()))
		{
			throw new Exception("Failed to update Cust!Caused by no such cust!");
		}
		BatisClient.getInstance().updateCustomer(cust);
	}
	
	/**
	 * 根据客户id精确查询客户信息
	 * @param custId
	 * @return
	 * @throws Exception 
	 */
	public Customer queryCustomerById(int custId) throws Exception
	{
		if( 0 >= custId)
		{
			throw new Exception("Failed to queryCustomerById!Caused by illegal custId!");
		}
		Customer cust = new Customer();
		cust.setId(custId);
		List<Customer> resultList = BatisClient.getInstance().queryCustomer(cust);
		if( null == resultList || 0 == resultList.size())
		{
			return null;
		}
		else
		{
			return resultList.get(0);
		}		
	}
	
	/**
	 * 根据名称模糊查询客户信息
	 * @param custName
	 * @return
	 * @throws Exception 
	 */
	public List<Customer> queryCustomerByName(String custName) throws Exception
	{
		if( null == custName)
		{
			throw new Exception("Failed to queryCustomerByName!Caused by null custName!");
		}
		Customer cust = new Customer();
		cust.setCustName(custName);
		List<Customer> list = BatisClient.getInstance().queryCustomer(cust);
		return list;
	}

}
