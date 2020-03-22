package com.capgemini.healthcaresystem.dto;


import java.util.ArrayList;
import java.util.List;

public class DiagnosticCenterDto 
{
	private String centerName;
	private String centerId;
	
	public DiagnosticCenterDto() {}
	
	public DiagnosticCenterDto(String centerId,String centerName)
	{
		this.centerName=centerName;
		this.centerId=centerId;
	}
	
	public String getCenterName() 
	{
		return centerName;
	}
	public void setCenterName(String centerName)
	{
		this.centerName = centerName;
	}
	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) 
	{
		this.centerId = centerId;
	}
	
	
     private List<TestDto> listOfTests=new ArrayList<TestDto>();
	
	
     public List<TestDto> getListOfTests() 
     {
		return listOfTests;
	}
	public void setListOfTests(List<TestDto> listOfTests) 
	{
		this.listOfTests = listOfTests;
	}
	
	
	private List<AppointmentDto> appointmentList=new ArrayList<AppointmentDto>();
	
	
	public List<AppointmentDto> getAppointmentList() {
		return appointmentList;
	}
	public void setAppointmentList(List<AppointmentDto> appointmentList) {
		this.appointmentList = appointmentList;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	
	
    

}
