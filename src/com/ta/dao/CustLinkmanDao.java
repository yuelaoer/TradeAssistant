package com.ta.dao;

import java.util.List;
import com.ta.bean.Customer;

public interface CustLinkmanDao 
{
	public List<Customer> queryCustomer(Customer cust) throws Exception;
	
 	public void addCustomer(Customer cust) throws Exception;
 	
 	public void updateCustomer(Customer cust) throws Exception;
 	
 	public void deleteCustomer(Customer cust) throws Exception;

}
