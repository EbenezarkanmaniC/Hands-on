package com.cts.patientintakesystem.model;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Component
public class ClinicCalender {
	private String clinicName;
	private List<PatientAppointment> appointments;
	
	public void addPatientAppointment(PatientAppointment patientAppointment)
	{
		appointments.add(patientAppointment);
	}
	public List<PatientAppointment> viewAllAppointments()
	{
		return appointments;
	}
}
