package com.capgemini.healthcaresystem.dao;


import com.capgemini.healthcaresystem.dto.AdminDto;
import com.capgemini.healthcaresystem.dto.AppointmentDto;
import com.capgemini.healthcaresystem.dto.DiagnosticCenterDto;
import com.capgemini.healthcaresystem.dto.TestDto;
import com.capgemini.healthcaresystem.dto.UserDto;
import com.capgemini.healthcaresystem.util.AdminDetailsRepository;
import com.capgemini.healthcaresystem.util.AppointmentRepository;
import com.capgemini.healthcaresystem.util.DiagnosticCenterRepository;

import com.capgemini.healthcaresystem.util.TestRepository;
import com.capgemini.healthcaresystem.util.UserRepository;

import java.util.*;

public class AdminDao implements AdminDaoInterface
{
	public AdminDao()
    {
    	
    	new DiagnosticCenterRepository();
    	new AppointmentRepository();
    	new TestRepository();
    	new UserRepository();
    	
    }
    
	//Reference Objects for Repositories
	
    List<AppointmentDto> newAppointmentCollectionObject=AppointmentRepository.getAppointmentCollectionObject();
    List<DiagnosticCenterDto> newDiagnosticCenterCollectionObject=DiagnosticCenterRepository.getDiagnosticCenterCollectionObject();
    List<TestDto> newTestCollectionObject=TestRepository.getTestCollectionObject();
    List<UserDto> newUserCollectionObject=UserRepository.getUserCollectionObject();
    List<AdminDto> newAdminDetailsCollectionObject=AdminDetailsRepository.getAdminCollectionObject();
    
    
    //Admin details
    
    public List<AdminDto> displayAdminDetailsDao(){
		return newAdminDetailsCollectionObject;
	}
    
    
	//Diagnostic Center
	
	
	public List<DiagnosticCenterDto> displayDiagnosticCenterDao()
	{
		return newDiagnosticCenterCollectionObject;
	}
	
    
    public boolean addDiagnosticCenterDao(DiagnosticCenterDto diagnosticcenter)
    {
    	newDiagnosticCenterCollectionObject.add(diagnosticcenter);
    	return true;
    }
    
    
  	public boolean deleteDiagnosticCenterDao(String deleteId)
  	{
  		
  		for(DiagnosticCenterDto index:newDiagnosticCenterCollectionObject)
  		{
  			 
  			if((index.getCenterId()).equals(deleteId))
  			{
  				newDiagnosticCenterCollectionObject.remove(index);
  		    	DiagnosticCenterRepository.setDiagnosticCenterCollectionObject(newDiagnosticCenterCollectionObject);
  		    	return true;

  			}
  		}
         
  		return false;  	
    }
  	
  	
  	public boolean updateDiagnosticCenterDao(String updateId,DiagnosticCenterDto updateObject)
	{
		for(DiagnosticCenterDto index: newDiagnosticCenterCollectionObject)
		{
			if((index.getCenterId()).equals(updateId))
			{
				index.setCenterId(updateObject.getCenterId());
				index.setCenterName(updateObject.getCenterName());
				
  		    	return true;
			}
		}
		
		return false;
	}
	
	//Test
	
  	public List<TestDto> displayTestDao()
	{
		return newTestCollectionObject;
	}
  	
	public boolean addTestDao(TestDto test)
	{
		newTestCollectionObject.add(test);
		return true;

	}
	
	public boolean deleteTestDao(String deleteId)
	{
		for(TestDto index:newTestCollectionObject)
  		{
  			if((index.getTestId()).equals(deleteId))
  			{
  				newTestCollectionObject.remove(index);
  				return true;

  			}
  		}
		
		return false;
  	
	}
	
	public boolean updateTestDao(String updateId, TestDto updateObject)
	{
		for(TestDto i: newTestCollectionObject)
		{
			if((i.getTestId()).equals(updateId))
			{
				i.setTestId(updateObject.getTestId());
				i.setTestName(updateObject.getTestName());
				return true;
			}
		}
		
		return false;
	

	}
	
	//Appointment 
	
	public boolean approveAppointmentDao(AppointmentDto appointment)
	{
		
		return true;
	}
	
	public boolean deleteAppointmentDao(long deleteId) 
	{
	    for(AppointmentDto index:newAppointmentCollectionObject)
	  	{
	  			if(index.getAppointmentId()==deleteId)
	  			{
	  				
	  				newAppointmentCollectionObject.remove(index);
	  				return true;
	  			}
	  	}
	    	return false;
			
	}
		
		public boolean updateAppointmentDao(long updateId, AppointmentDto updateObject) 
		{
			for(AppointmentDto index: newAppointmentCollectionObject)
			{
				if(index.getAppointmentId()==updateId)
				{
					index.setAppointmentId(updateObject.getAppointmentId());
					return true;
				}
			}
			
			return false;
		}
		
		
		
		
		
		
}
