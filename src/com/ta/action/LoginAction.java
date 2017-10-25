package com.ta.action;

import com.ta.test.TestDataSource;

public class LoginAction 
{
	private String userName;
	private String password;
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
	
	public String execute()
	{
		if("wwt".equals(userName) && "123456".equals(password))
		{
			return "success";
		}
		else
		{
			return "error";
		}
	}

}
