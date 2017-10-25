package com.ta.action;

import java.util.ArrayList;

public class MainAction 
{
	private ArrayList<String> list;

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	
	public String execute()
	{
		list = new ArrayList<String>();
		list.add("wwt");
		list.add("wwt");
		list.add("wwt");
		list.add("wwt");
		list.add("wwt");
		return "success";
	}
}
