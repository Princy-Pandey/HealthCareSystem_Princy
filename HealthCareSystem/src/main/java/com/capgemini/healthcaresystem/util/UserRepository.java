package com.capgemini.healthcaresystem.util;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.capgemini.healthcaresystem.dto.UserDto;

public class UserRepository 
{
	public static List<UserDto> userCollectionObject=new CopyOnWriteArrayList<UserDto>();
	
	static {
		userCollectionObject.add(new UserDto("Admin ","1 ","Princy ","vhvhvhvh ",7508027308L," knbvcxvb ",23," F "));
		  userCollectionObject.add(new UserDto("Admin ","2 ","kittu ","vhvhv",7800370887L," knb ",10," F "));
		  userCollectionObject.add(new UserDto("Admin ","3 ","Anurag ","vhvhv",867348773L," knxvb ",22," M "));
		  userCollectionObject.add(new UserDto("Admin ","4 ","Nikhita ","vhvh",6538929988L," cxvb ",23," F "));
	}
	  
	public static List<UserDto> getUserCollectionObject()
	{
		return userCollectionObject;
	}
	public static void setUserCollectionObject(List<UserDto> userCollectionObject)
	{
		UserRepository.userCollectionObject = userCollectionObject;
	}
	
}
