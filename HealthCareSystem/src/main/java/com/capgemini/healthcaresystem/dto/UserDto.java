package com.capgemini.healthcaresystem.dto;


public class UserDto
{
	private String userId;
	private String userPassword;
	private String userName;
	private long contactNo;
	private String userEmail;
	private String userRole;
	private int age;
	private String gender;
	
	//ArrayList<DignosticCentreDto> centreList = new ArrayList<DignosticCentreDto>();
	// HashMap<UserDto> userList = new HashMap<UserDto>();
	
	public UserDto(String userRole,String userId,String userName,String userPassword,long contactNo,String userEmail, int age, String gender)
	{
		this.userId=userId;
		this.userName=userName;
		this.userPassword=userPassword;
		this.contactNo=contactNo;
		this.userEmail=userEmail;	
		this.userRole=userRole;
		this.age=age;
		this.gender=gender;
	}

	public String getUserId() 
	{
		return userId;
	}
	public void setUserId(String userId) 
	{
		this.userId = userId;
	}
	
	public String getUserName() 
	{
		return userName;
	}
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	
	public String getUserPassword() 
	{
		return userPassword;
	}
	public void setUserPassword(String userPassword) 
	{
		this.userPassword = userPassword;
	}
	
	public long getContactNo() 
	{
		return contactNo;
	}
	public void setContactNo(long contactNo) 
	{
		this.contactNo = contactNo;
	}
	
	public String getUserEmail() 
	{
		return userEmail;
	}
	public void setUserEmail(String userEmail) 
	{
		this.userEmail = userEmail;
	}
	
	public String getUserRole() 
	{
		return userRole;
	}
	public void setUserRole(String userRole) 
	{
		this.userRole = userRole;
	}
	
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}

	public String getGender() 
	{
		return gender;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


}
