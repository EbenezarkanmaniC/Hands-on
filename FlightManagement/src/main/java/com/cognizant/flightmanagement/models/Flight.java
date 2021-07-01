package com.cognizant.flightmanagement.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Flight {
	private String id;
	private String flightType;
	private List<Passenger> passengers= new ArrayList<>();

	public boolean addPassenger(Passenger passenger) {
		return passengers.add(passenger);
	}

	public boolean removePassenger(Passenger passenger) {
		return passengers.remove(passenger);
	}

	public Object getFlightType() {
		// TODO Auto-generated method stub
		return null;
	}
}
