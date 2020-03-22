package com.capgemini.healthcaresystem.dao;

import com.capgemini.healthcaresystem.dto.AppointmentDto;
import com.capgemini.healthcaresystem.dto.DiagnosticCenterDto;
import com.capgemini.healthcaresystem.dto.TestDto;

public interface AdminDaoInterface 
{
	abstract boolean addDiagnosticCenterDao(DiagnosticCenterDto diagnosticcenter);
	abstract boolean deleteDiagnosticCenterDao(String deleteId);

	abstract boolean updateDiagnosticCenterDao(String updateId,DiagnosticCenterDto updateObject);

	abstract boolean addTestDao(TestDto test);

	abstract boolean deleteTestDao(String deleteId);

	abstract boolean updateTestDao(String updateId, TestDto updateObject);

	
	abstract boolean approveAppointmentDao(AppointmentDto appointment);

	abstract boolean deleteAppointmentDao(long deleteId);

	abstract boolean updateAppointmentDao(long updateId, AppointmentDto updateObject);

}
