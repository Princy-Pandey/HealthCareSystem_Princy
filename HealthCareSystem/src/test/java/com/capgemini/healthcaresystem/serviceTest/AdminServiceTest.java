package com.capgemini.healthcaresystem.serviceTest;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import com.capgemini.healthcaresystem.dto.AppointmentDto;
import com.capgemini.healthcaresystem.dto.DiagnosticCenterDto;
import com.capgemini.healthcaresystem.dto.TestDto;

import com.capgemini.healthcaresystem.exception.InvalidAppointmentDetailsException;
import com.capgemini.healthcaresystem.exception.InvalidDiagnosticCenterDetailsException;
import com.capgemini.healthcaresystem.exception.InvalidTestDetailsException;
import com.capgemini.healthcaresystem.service.AdminService;
import com.capgemini.healthcaresystem.util.AdminDetailsRepository;
import com.capgemini.healthcaresystem.util.DiagnosticCenterRepository;


public class AdminServiceTest 
{
	
	@Test
	public void displayAdminDetailsTest() 
	{
		assertThat(AdminDetailsRepository.getAdminCollectionObject(),is(serviceobj.displayAdminDetailsService()));
	}
	
   AdminService serviceobj=new AdminService();
   
   DiagnosticCenterDto diagnosticobject=new DiagnosticCenterDto();
   
   
   @Test
   public void displayDiagnosticCenterTest()
   {
	   assertThat(DiagnosticCenterRepository.getDiagnosticCenterCollectionObject(),is(serviceobj.displayDiagnosticCenterService()));
   }
   
   
   @Test
   public void addDiagnosticCenterTest() throws InvalidDiagnosticCenterDetailsException
   {
	   diagnosticobject.setCenterId("");
	   assertEquals(true,serviceobj.addDiagnosticCenter(diagnosticobject));
	   
   }
   @Test
   public void addDiagnosticCenterTest1() throws InvalidDiagnosticCenterDetailsException
   { 
	   diagnosticobject.setCenterId("123");
	   assertEquals(true,serviceobj.addDiagnosticCenter(diagnosticobject));
	   
   }
	   
	   @Test
   public void addDiagnosticCenterTest2() throws InvalidDiagnosticCenterDetailsException
   {
		   diagnosticobject.setCenterName("Jalandhar");
		   
		   assertEquals("Added",serviceobj.addDiagnosticCenter(diagnosticobject));
	   
   }
   
   @Test
   public void deleteDiagnosticCenterTest()
   {
	   String deleteIdNotExists="6";
	   String result=serviceobj.deleteDiagnosticCenter(deleteIdNotExists);
		
		assertEquals("not deleted",result);
   }
   
   public void deleteDiagnosticCenterTest1()
   {
	
	String deleteIdExists="";
	String resultExists=serviceobj.deleteDiagnosticCenter(deleteIdExists);
			
		assertEquals("deleted",resultExists);
		assertEquals("not deleted",resultExists);
   }
   
   @Test
   public void updateDiagnosticCenterTest1() throws InvalidDiagnosticCenterDetailsException 
   {
	   diagnosticobject.setCenterId("");
	   
	   assertEquals(true,serviceobj.updateDiagnosticCenter("",diagnosticobject));
	   
	
   }
   @Test
   public void updateDiagnosticCenterTest2() throws InvalidDiagnosticCenterDetailsException 
   {
	    diagnosticobject.setCenterId("12345");
					
		assertEquals("Updated",serviceobj.updateDiagnosticCenter("1", diagnosticobject));

   }
   @Test
   public void updateDiagnosticCenterTest3() throws InvalidDiagnosticCenterDetailsException 
   {
   
		assertEquals("Could not find the ID",serviceobj.updateDiagnosticCenter("1567", diagnosticobject));
	}

   
   
   
   // -----------Testing Appointment--------------------//
   
   AppointmentDto appointmentobj=new AppointmentDto();
   
  
    @Test
   public void deleteAppointmentTest()
   {
	   long deleteIdNotExists=6;
	   String result=serviceobj.deleteAppointment(deleteIdNotExists);
		
		assertEquals(true,result);
   }
		
	//Checking for Delete Id exists.
    @Test
    public void deleteAppointmentTest1()
    {
	long deleteIdExists=1;
	String resultExists=serviceobj.deleteAppointment(deleteIdExists);
			
		assertEquals("not deleted",resultExists);
		assertEquals("deleted",1);
   }
   
   @Test
   public void updateAppointmentTest1() throws InvalidAppointmentDetailsException 
   {
	   appointmentobj.setAppointmentId(12);
	   assertEquals(true,serviceobj.updateAppointment(1,appointmentobj));
   }
			@Test
	public void updateAppointmentTest2() throws InvalidAppointmentDetailsException 
	{
		appointmentobj.setAppointmentId(12345);
		
		assertEquals("Updated",serviceobj.updateAppointment(1, appointmentobj));

	 }
			
	public void updateAppointmentTest3() throws InvalidAppointmentDetailsException 
	{
		assertEquals("Could not find the ID",serviceobj.updateAppointment(1567, appointmentobj));
	}
   
   ///---------------------Testing Test-----------------//
   
   TestDto testobj=new TestDto();
   @Test
   public void addTestTest2() throws InvalidTestDetailsException
   {
	   testobj.setTestId("");
   assertEquals(true,serviceobj.addTest(testobj));
   }
   
   
   @Test
   public void addTestTest1() throws InvalidTestDetailsException
   {
	   testobj.setTestId("12345");
   assertEquals(true,serviceobj.addTest(testobj));
   }
   
   
   @Test
   public void addTestTest() throws InvalidTestDetailsException
   {
	   testobj.setTestId("12345");
	   testobj.setTestName("abc");
	   
	   assertEquals("Added",serviceobj.addTest(testobj));
	   
   }
  
   @Test
   public void deleteTestTest()
   {
	   String deleteIdNotExists="6";
	   String result=serviceobj.deleteTest(deleteIdNotExists);
		
		assertEquals(true,result);
		
   }
   @Test
   public void deleteTestTest1()
   {
	    assertEquals("deleted",serviceobj.deleteTest("1"));
		assertEquals("not deleted",serviceobj.deleteTest("23"));
		
   }
   
   @Test
	public void updateTestTest() throws InvalidTestDetailsException 
   {
	   testobj.setTestId("12345");
		assertEquals("Updated",serviceobj.updateTest("1", testobj));

		
		assertEquals("Could not find the ID",serviceobj.updateTest("1567", testobj));
	}
   @Test
   public void updateTestTest1() throws InvalidTestDetailsException 
   {
	   testobj.setTestId("12345");
	   assertEquals(true,serviceobj.updateTest("1",testobj));
   }

}
