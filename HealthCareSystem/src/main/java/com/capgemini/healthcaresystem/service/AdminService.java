package com.capgemini.healthcaresystem.service;


import java.util.List;

import com.capgemini.healthcaresystem.dao.AdminDao;
import com.capgemini.healthcaresystem.dto.AdminDto;
import com.capgemini.healthcaresystem.dto.AppointmentDto;
import com.capgemini.healthcaresystem.dto.DiagnosticCenterDto;
import com.capgemini.healthcaresystem.dto.TestDto;
import com.capgemini.healthcaresystem.exception.InvalidAppointmentDetailsException;
import com.capgemini.healthcaresystem.exception.InvalidDiagnosticCenterDetailsException;
import com.capgemini.healthcaresystem.exception.InvalidTestDetailsException;

public class AdminService implements AdminServiceInterface
{
    AdminDao admindao;
    
    public AdminService()
    {
    	admindao=new AdminDao();
    }

	
    public List<AdminDto> displayAdminDetailsService(){
		return admindao.displayAdminDetailsDao();
	}
	
	//Appointment 
	
	public boolean approveAppointment(AppointmentDto appointment)
	{
		if(admindao.approveAppointmentDao(appointment))
		{
			return true;
		}
		return false;
	}
	
    public String deleteAppointment(long deleteId) 
    {
    	if(admindao.deleteAppointmentDao(deleteId))
		{
			return "Deleted";
			
		}
		else
		{
			return "Not Deleted";
		}
    	
	}
	
	public String updateAppointment(long updateId, AppointmentDto updateObject) throws InvalidAppointmentDetailsException
	{
		if((String.valueOf(updateObject.getAppointmentId()).length())<4)
		{
			throw new InvalidAppointmentDetailsException(" Appointment id cannot be less than 4 digits!!");
		}
		
		if(String.valueOf(updateObject.getAppointmentId()).length()==0)
		{
			
			throw new InvalidAppointmentDetailsException(" Appointment  id cannot be zero!!");

		}
		
		if(admindao.updateAppointmentDao(updateId,updateObject))
		{
			return "Updated";
			
		}
		else
		{
			return "Could not find Id";
		}
		
	}
	

	//Diagnostic Center
	
	public String addDiagnosticCenter(DiagnosticCenterDto diagnosticcenter) throws InvalidDiagnosticCenterDetailsException
	{
		
		if((String.valueOf(diagnosticcenter.getCenterId()).length())<4)
		{
			throw new InvalidDiagnosticCenterDetailsException(" Diagnostic Center id cannot be less than 4 digits!!");
		}
		if(String.valueOf(diagnosticcenter.getCenterId()).length()==0)
		{
			
			throw new InvalidDiagnosticCenterDetailsException(" Diagnostic Center id cannot be zero!!");

		}
		
		if((String.valueOf(diagnosticcenter.getCenterName()).length())<4)
		{
			throw new InvalidDiagnosticCenterDetailsException(" Diagnostic Center name cannot be less than 4 digits!!");
		}
		
		if((String.valueOf(diagnosticcenter.getCenterName()))==null)
		{
			throw new InvalidDiagnosticCenterDetailsException(" Diagnostic Center name cannot be null!!");
		}
		
		
		
		if(admindao.addDiagnosticCenterDao(diagnosticcenter))
		{
			return "Added";
			
		}
		else
		{
			return "Not Added";
		}
		
	}
	
	public String deleteDiagnosticCenter(String deleteId)
	{
		
		if(admindao.deleteDiagnosticCenterDao(deleteId))
		{
			return "Deleted";
			
		}
		else
		{
			return "Not Deleted";
		}
		
		
	}
	
	public String updateDiagnosticCenter(String updateId, DiagnosticCenterDto updateObject) throws InvalidDiagnosticCenterDetailsException
	{
		if(String.valueOf(updateObject.getCenterId()).length()<4)
		{
			throw new InvalidDiagnosticCenterDetailsException(" Diagnostic Center id cannot be less than 4 digits!!");
		}
		
		if(String.valueOf(updateObject.getCenterId()).length()==0)
		{
			
			throw new InvalidDiagnosticCenterDetailsException(" Diagnostic Center id cannot be zero!!");

		}
		
		if(admindao.updateDiagnosticCenterDao(updateId,updateObject))
		{
			return "Updated";
			
		}
		else
		{
			return "Could not find Id";
		}
		
		
		
	}
	public List<DiagnosticCenterDto> displayDiagnosticCenterService() 
	{
		return admindao.displayDiagnosticCenterDao();
	}
	
	//Test
	public List<TestDto> displayTestService() 
	{
		
		return admindao.displayTestDao();
		
	}
	
	public String addTest(TestDto test) throws InvalidTestDetailsException
	{
		if(String.valueOf(test.getTestId()).length()<4)
		{
			throw new InvalidTestDetailsException(" Test id cannot be less than 4 digits!!");
		}
		
	   if(String.valueOf(test.getTestId()).length()==0)
		{
			
			throw new InvalidTestDetailsException(" Test id cannot be zero!!");

		}
	   
	   if(String.valueOf(test.getTestName()).length()<4)
		{
			throw new InvalidTestDetailsException(" Test name cannot be less than 4 digits!!");
		}
		
	   if(String.valueOf(test.getTestName()).length()==0)
		{
			
			throw new InvalidTestDetailsException(" Test name cannot be zero!!");

		}
	   
	   
		
		if(admindao.addTestDao(test))
		{
			return "Added";
			
		}
		else
		{
			return "Not Added";
		}
		
	}
	
	public String deleteTest(String deleteId)
	{
		if(admindao.deleteTestDao(deleteId))
		{
			return "Deleted";
			
		}
		else
		{
			return "Not Deleted";
		}
		
	}
	
	public String updateTest(String updateId ,TestDto updateObject) throws InvalidTestDetailsException
	{
		if(String.valueOf(updateObject.getTestId()).length()<4)
		{
			throw new InvalidTestDetailsException(" Test id cannot be less than 4 digits!!");
		}
		
		if(String.valueOf(updateObject.getTestId()).length()==0)
		{
			
			throw new InvalidTestDetailsException(" Test id cannot be zero!!");

		}
		
		if(admindao.updateTestDao(updateId,updateObject))
		{
			return "Updated";
			
		}
		else
		{
			return "Could not find Id";
		}
		
	}
	
	
	
	
}
