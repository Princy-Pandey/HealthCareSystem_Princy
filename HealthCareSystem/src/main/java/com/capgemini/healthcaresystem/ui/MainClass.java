package com.capgemini.healthcaresystem.ui;


import java.util.InputMismatchException;
import java.util.Scanner;

import com.capgemini.healthcaresystem.dto.AdminDto;
import com.capgemini.healthcaresystem.dto.AppointmentDto;
import com.capgemini.healthcaresystem.dto.DiagnosticCenterDto;
import com.capgemini.healthcaresystem.dto.TestDto;
import com.capgemini.healthcaresystem.exception.InvalidAppointmentDetailsException;
import com.capgemini.healthcaresystem.exception.InvalidDiagnosticCenterDetailsException;
import com.capgemini.healthcaresystem.exception.InvalidTestDetailsException;
import com.capgemini.healthcaresystem.service.AdminService;

public class MainClass 
{
    public static void main(String args[])
    {
    	AdminService adminServiceObject=new AdminService();
    	
    	System.out.println("-----------HEALTH CARE SYSTEM------------");
    	System.out.println("****************** WELCOME ADMIN ******************");
    	Scanner scanObject=new Scanner(System.in);
    	int userInputChoice=1;
    	String deleteInputId;
    	
    	
    	try
    	{
    		
	    	while(userInputChoice!=0) 
	    	{
	    		System.out.println("Press\n1.Diagnostic Center\n2.Appointment\n3.Test Available\n4.Admin Details");
	    		userInputChoice=scanObject.nextInt();
	    		
	    		switch(userInputChoice) 
	    		{
	    		
	    		//----Diagnostic Center-----
	    		
		       case 1:	
		    		System.out.println("Press\n1.Display\n2.Add\n3.Delete\n4.Update");
		    		userInputChoice=scanObject.nextInt();
		    		
		    		switch(userInputChoice) 
		    		{
		    		//Display
		    		case 1:
		    			for(DiagnosticCenterDto index:adminServiceObject.displayDiagnosticCenterService())
		    			{
		    				System.out.print("Center Id is: "+index.getCenterId()+"          Center Name is: "+index.getCenterName());
		    				System.out.println();
		    			}
		    		    break;
		    		    
		    		//Add
		    		case 2:
		    			DiagnosticCenterDto object=new DiagnosticCenterDto();
						System.out.println("Enter the Diagnostic Center Id: ");
						String inputDiagnosticCenterId=scanObject.next();
						object.setCenterId(inputDiagnosticCenterId);
						
						System.out.println("Enter the Diagnostic Center Name: ");
						String inputDiagnosticCenterName=scanObject.next();
						object.setCenterName(inputDiagnosticCenterName);
						
						try 
						{
							System.out.println(adminServiceObject.addDiagnosticCenter(object));
						}
						catch(InvalidDiagnosticCenterDetailsException e)
						{
							System.out.println(e.getMessage());
						}
						
						break;
						
					//Delete
		    		case 3:
						System.out.println("Enter the diagnostic center Id to be deleted");
						deleteInputId=scanObject.next();
						
						System.out.println(adminServiceObject.deleteDiagnosticCenter(deleteInputId));
						break;
						
					//Update
		    		case 4:
						System.out.println("Enter the diagnostic center to be updated");
						String updateInputId=scanObject.next();
						
						DiagnosticCenterDto updateObject=new DiagnosticCenterDto();
						System.out.println("Enter the updated details: ");
						System.out.println("Enter the DiagnosticCenterID: ");
						String inputUpdatedId=scanObject.next();
						
						updateObject.setCenterId(inputUpdatedId);
						
						System.out.println("Enter Diagnostic Center name: ");
						String inputUpdatedName=scanObject.next();
						updateObject.setCenterName(inputUpdatedName);
						
						try 
						{
						System.out.println(adminServiceObject.updateDiagnosticCenter(updateInputId,updateObject));
						}
						
						catch(InvalidDiagnosticCenterDetailsException e)
						{
							System.out.println(e.getMessage());
						}
						
		    		}
		    		break;
		    		
	     //---------------Appointment------------------
		    		
			     case 2:
			    	 
			    	 System.out.println("Press\n1.ApprovalStatus\n2.Delete\n3.Update");
			 		 userInputChoice=scanObject.nextInt();
			 		
			 		 switch(userInputChoice) 
			 		 {
			 		 //Approval 
				 		case 1:
				 			AppointmentDto object=new AppointmentDto();
							System.out.println("Enter the Appointment Id: ");
							long inputAppointmentId=scanObject.nextInt();
							object.setAppointmentId(inputAppointmentId);
								
							break;
							
						//Delete
				 		case 2:
				 			
							System.out.println("Enter the Appointment Id to be deleted");
							long deleteInputId1=scanObject.nextInt();
							adminServiceObject.deleteAppointment(deleteInputId1);
								
							break;
								
						//Update
				 		case 3:
								
							System.out.println("Enter the Appointment Id to be updated");
							long updateInputId1=scanObject.nextInt();
							
							AppointmentDto updateObject=new AppointmentDto();
							System.out.println("Enter the updated details: ");
							System.out.println("Enter the AppointmentID: ");
							long inputUpdatedId1=scanObject.nextInt();
							updateObject.setAppointmentId(inputUpdatedId1);
								
							try 
						    {
							System.out.println(adminServiceObject.updateAppointment(updateInputId1,updateObject));
							}
							
							catch(InvalidAppointmentDetailsException e)
							{
								System.out.println(e.getMessage());
							}
						}
			 		    break;
	 		
	 	//-------------Test--------------
				     case 3:
				    	 
				    	 System.out.println("Press\n1.Display\n2.Add\n3.Delete\n4.Update");
				  		 userInputChoice=scanObject.nextInt();
				  		
			  		 switch(userInputChoice) 
			  		 {
				  		 //Display
					  		
				  		case 1:
				  			
							for(TestDto index:adminServiceObject.displayTestService())
							{
								System.out.print("Test id is: "+index.getTestId()+" Test name is: "+index.getTestName());
								System.out.println();
							}
						    break;
							    
							 //Add
				  		case 2:
				  			
				  			TestDto object=new TestDto();
							System.out.println("Enter the Test Id: ");
							String inputTestId=scanObject.next();
							object.setTestId(inputTestId);
							
							System.out.println("Enter the Test Name: ");
							String inputTestName=scanObject.next();
							object.setTestName(inputTestName);
							
							try 
							{
								System.out.println(adminServiceObject.addTest(object));
							}
							
							catch(InvalidTestDetailsException e)
							{
								System.out.println(e.getMessage());
							}
							
							break;
								
							//Delete
				  		case 3:
							
							System.out.println("Enter the test Id to be deleted");
							deleteInputId=scanObject.next();
							
							adminServiceObject.deleteTest(deleteInputId);
							
							break;
							
						//Update
				  		case 4:
				 				
			 				System.out.println("Enter the Test Id to be updated");
			 				String updateInputId1=scanObject.next();
			 				
			 				TestDto updateObject=new TestDto();
			 				System.out.println("Enter the updated details: ");
			 				System.out.println("Enter the Test ID: ");
			 				String inputUpdatedId1=scanObject.next();
			 				updateObject.setTestId(inputUpdatedId1);
			 				
			 				try 
		 				    {
							System.out.println(adminServiceObject.updateTest(updateInputId1,updateObject));
							}
								
							catch(InvalidTestDetailsException e)
							{
								System.out.println(e.getMessage());
							}
			 				break;
				  		}
	  		
	  		//----------Admin Details-----------------
				     case 4: 
				    	 
				    	 for(AdminDto index: adminServiceObject.displayAdminDetailsService()) 
				    	    {
								System.out.println(index.getAdminId());
								System.out.println(index.getAdminName());
							}
							break;
				  }
			 }
	    	
	    	System.out.println("---------Thankyou-----------");
	    	scanObject.close();
    	}
    
    	catch(InputMismatchException e)
    	{
    		System.out.println("Choose correct option");
    	}
    	
    }
}

