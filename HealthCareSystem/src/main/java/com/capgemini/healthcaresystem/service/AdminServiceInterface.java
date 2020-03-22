package com.capgemini.healthcaresystem.service;

import com.capgemini.healthcaresystem.dto.AppointmentDto;
import com.capgemini.healthcaresystem.dto.DiagnosticCenterDto;
import com.capgemini.healthcaresystem.dto.TestDto;
import com.capgemini.healthcaresystem.exception.InvalidAppointmentDetailsException;
import com.capgemini.healthcaresystem.exception.InvalidDiagnosticCenterDetailsException;
import com.capgemini.healthcaresystem.exception.InvalidTestDetailsException;

public interface AdminServiceInterface 
{
	abstract boolean approveAppointment(AppointmentDto appointment);
	abstract String deleteAppointment(long deleteId) ;
	abstract String updateAppointment(long updateId, AppointmentDto updateObject) throws InvalidAppointmentDetailsException ;
	
	abstract String addDiagnosticCenter(DiagnosticCenterDto diagnosticcenter) throws InvalidDiagnosticCenterDetailsException ;
	abstract String deleteDiagnosticCenter(String deleteId);
	abstract String updateDiagnosticCenter(String updateId, DiagnosticCenterDto updateObject) throws InvalidDiagnosticCenterDetailsException ;
	
	abstract String addTest(TestDto test) throws InvalidTestDetailsException ;
	abstract String deleteTest(String deleteId);
	abstract String updateTest(String updateId ,TestDto updateObject) throws InvalidTestDetailsException;
	

}
