package com.ta.test;

/**
 * 测试用数据源
 * @author Allen
 *
 */
public class TestDataSource 
{
	private static TestDataSource instance;
	
	public static TestDataSource getInstance()
	{
		return instance;
	}
	
	private TestDataSource()
	{
		instance = new TestDataSource();
	}
	
	private String userName = "wwt";
	
	private String password = "123456";

	public String getUserName() 
	{
		return userName;
	}

	public void setUserName(String userName) 
	{
		this.userName = userName;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

}
