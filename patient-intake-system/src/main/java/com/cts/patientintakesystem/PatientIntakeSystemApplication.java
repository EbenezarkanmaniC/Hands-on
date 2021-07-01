package com.cts.patientintakesystem;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.patientintakesystem.enums.Doctor;
import com.cts.patientintakesystem.model.ClinicCalender;
import com.cts.patientintakesystem.model.PatientAppointment;

import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@Log4j2
public class PatientIntakeSystemApplication {
	@Autowired
	private static ClinicCalender clinicCalender;
	
	public static void main(String[] args) {
		SpringApplication.run(PatientIntakeSystemApplication.class, args);
		PatientAppointment patientAppointment =new PatientAppointment();
		patientAppointment.setName("nikky");
		patientAppointment.setAge(31);
		patientAppointment.setVisitingDoctor(Doctor.CARDIALOGIST);
		patientAppointment.setAppointment(new Date());
		clinicCalender.addPatientAppointment(patientAppointment);
		log.info("All Appointments: {}",clinicCalender.viewAllAppointments());
		
	}

}
