package com.capgmini.healthcaresystem.daoTest;


import static org.hamcrest.CoreMatchers.*;
//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;


import org.junit.jupiter.api.Test;

import com.capgemini.healthcaresystem.dao.AdminDao;
import com.capgemini.healthcaresystem.dto.AppointmentDto;
import com.capgemini.healthcaresystem.dto.DiagnosticCenterDto;
import com.capgemini.healthcaresystem.dto.TestDto;

import com.capgemini.healthcaresystem.util.DiagnosticCenterRepository;
import com.capgemini.healthcaresystem.util.TestRepository;


public class AdminDaoTest 
{
	AdminDao daoobj=new AdminDao();
	   
	   DiagnosticCenterDto diagnosticobject=new DiagnosticCenterDto();
	   
	   @Test
	   public void displayDiagnosticCenterTest()
	   {
			assertThat(DiagnosticCenterRepository.getDiagnosticCenterCollectionObject(),is(daoobj.displayDiagnosticCenterDao()));

	   }
	   @Test
	   public void addDiagnosticCenterTest() 
	   {
		   diagnosticobject.setCenterId("12345");
		   diagnosticobject.setCenterName("abc");
		   assertEquals(true,daoobj.addDiagnosticCenterDao(diagnosticobject));
		   
	   }
	   
	   @Test
	   public void deleteDiagnosticCenterTest1()
	   {
	    String deleteId="2";
		assertEquals(true,daoobj.deleteDiagnosticCenterDao(deleteId));
	   }
	   
	   @Test
	   public void deleteDiagnosticCenterTest2()
	   {
		   String deleteId="1";
		assertEquals(false,daoobj.deleteDiagnosticCenterDao(deleteId));

	   }
	   
	   @Test
		public void updateDiagnosticCenterTest()
    {     
		        diagnosticobject.setCenterId("12345");
				
				diagnosticobject.setCenterName("nnj");
			
			assertEquals(true,daoobj.updateDiagnosticCenterDao("2", diagnosticobject));

			
			assertEquals(false,daoobj.updateDiagnosticCenterDao("6", diagnosticobject));
		}

	   
	   
	   
	   // -----------Testing Appointment--------------------//
	   
	   AppointmentDto appointmentobj=new AppointmentDto();
	   
	  
	   @Test
	   public void deleteAppointmentTest()
	   {
		long deleteId=2;
		assertEquals(true,daoobj.deleteAppointmentDao(deleteId));
		
	    deleteId=6;
		assertEquals(false,daoobj.deleteAppointmentDao(deleteId));

	   }
	   
	   @Test
		public void updateAppointmentTest()
	   {
		    appointmentobj.setAppointmentId(12345);
			
		    assertEquals(true,daoobj.updateAppointmentDao(2, appointmentobj));

			assertEquals(false,daoobj.updateAppointmentDao(6, appointmentobj));
		}
	   
	   ///---------------------Testing Test-----------------//
	   
	   TestDto testobj=new TestDto();
	   @Test
	   public void displayTestTest()
	   {
		   assertThat(TestRepository.getTestCollectionObject(),is(daoobj.displayTestDao()));

	   }
	   
	   @Test
	   public void addTestTest() 
	   {
		  
		   testobj.setTestId("12345");
		   testobj.setTestName("abc");
		   
		   assertEquals(true,daoobj.addTestDao(testobj));
		     
	   }
	   
	   @Test
	   public void deleteTestTest()
	   {
		String deleteId="2";
		assertEquals(true,daoobj.deleteTestDao(deleteId));

		deleteId="6";
		assertEquals(false,daoobj.deleteTestDao(deleteId));

	   }
	   
	   @Test
		public void updateTestTest() 
		{
			testobj.setTestId("12345");
			
			assertEquals(true,daoobj.updateTestDao("2", testobj));

			
			assertEquals(false,daoobj.updateTestDao("6", testobj));
		}
	   
	   

}
