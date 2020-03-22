package com.capgemini.healthcaresystem.util;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.capgemini.healthcaresystem.dto.AdminDto;

public class AdminDetailsRepository 
{
private static List<AdminDto> adminCollectionObject=new CopyOnWriteArrayList<AdminDto>();
	
	static
	{
		adminCollectionObject.add(new AdminDto(1213,"Princy Pandey"));
	}

	public static List<AdminDto> getAdminCollectionObject() {
		return adminCollectionObject;
	}

	public static void setAdminCollectionObject(List<AdminDto> adminCollectionObject) {
		AdminDetailsRepository.adminCollectionObject = adminCollectionObject;
	}
}
 