package com.cts.patientintakesystem.model;

import java.util.Date;

import com.cts.patientintakesystem.enums.Doctor;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PatientAppointment {
	private String name;
	private int age;
	private Doctor visitingDoctor;
	private Date appointment;
}
