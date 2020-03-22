package com.capgemini.healthcaresystem.util;


import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.capgemini.healthcaresystem.dto.AppointmentDto;


public class AppointmentRepository 
{
  public static List<AppointmentDto> appointmentCollectionObject=new CopyOnWriteArrayList<AppointmentDto>();
  
  public static List<AppointmentDto> getAppointmentCollectionObject() 
  {
	return appointmentCollectionObject;
}
public static void setAppointmentCollectionObject(List<AppointmentDto> appointmentCollectionObject)
{
	AppointmentRepository.appointmentCollectionObject = appointmentCollectionObject;
}
DateTimeFormatter myFormat=DateTimeFormatter.ofPattern("dd MM yyyy");
  public AppointmentRepository()
  {
	  //UserRepository userObject=new UserRepository();
	  //TestRepository testObject= new TestRepository();
	  //appointmentCollectionObject.add(new AppointmentDto(userObject.userCollectionObject.get(0),1234L,testObject.testCollectionObject.get(0),LocalDate.parse("1 2 2020",myFormat),true));
	  
	  
	  
	  
	  /*appointmentCollectionObject.add(new AppointmentDto());
	  appointmentCollectionObject.add(new AppointmentDto());
	  appointmentCollectionObject.add(new AppointmentDto());
	  
	  for(AppointmentDto index: appointmentCollectionObject )
	  {
		  System.out.println("Appointment:"+ index.getUser()+ index.getAppointmentId()+ index.getDatetime()+ index.getTest() + index.isApproved());
		 // System.out.println("Appointment 2 :"+ index.getUser()+ index.getAppointmentId()+ index.getDatetime()+ index.getTest() + index.isApproved());
		  //System.out.println("Appointment 3 :"+ index.getUser()+ index.getAppointmentId()+ index.getDatetime()+ index.getTest() + index.isApproved());
	  }*/
  }

   
}
