package com.capgemini.healthcaresystem.dto;


import java.time.LocalDate;

public class AppointmentDto {
		private UserDto user;
		private	long appointmentId;
		private TestDto test;
		private LocalDate datetime;
		private boolean approved;
		
		public AppointmentDto() {}
		
		public AppointmentDto(UserDto user,long appointmentId,TestDto test,LocalDate datetime,boolean approved ) 
		{
			this.user=user;
			this.appointmentId=appointmentId;
			this.test=test;
			this.datetime=datetime;
			this.approved=approved;
		}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	public long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public TestDto getTest() {
		return test;
	}
	public void setTest(TestDto test) {
		this.test = test;
	}
	public LocalDate getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDate datetime) {
		this.datetime = datetime;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
