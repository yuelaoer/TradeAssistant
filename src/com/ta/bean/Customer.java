package com.ta.bean;

public class Customer
{
	private int id;
	private String custName;
	private int default_linkman_id;
	private String country;
	private String address;
	private String tele;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getCustName()
	{
		return custName;
	}
	public void setCustName(String custName)
	{
		this.custName = custName;
	}
	public int getDefault_linkman_id()
	{
		return default_linkman_id;
	}
	public void setDefault_linkman_id(int default_linkman_id)
	{
		this.default_linkman_id = default_linkman_id;
	}
	public String getCountry()
	{
		return country;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getTele()
	{
		return tele;
	}
	public void setTele(String tele)
	{
		this.tele = tele;
	}

}
