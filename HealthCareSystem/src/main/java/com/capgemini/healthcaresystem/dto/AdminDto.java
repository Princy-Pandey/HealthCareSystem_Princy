package com.capgemini.healthcaresystem.dto;

public class AdminDto 
{
	private int adminId;
	private String adminName;

    //Default Constructor
	public AdminDto() {}

    //Parameterized Constructor
	public AdminDto(int adminId, String adminName) 
	{
		super();
		this.adminId = adminId;
		this.adminName = adminName;
	}


	public int getAdminId() 
	{
		return adminId;
	}


	public void setAdminId(int adminId) 
	{
		this.adminId = adminId;
	}


	public String getAdminName() 
	{
		return adminName;
	}


	public void setAdminName(String adminName) 
	{
		this.adminName = adminName;
	}

}
