package com.cognizant.flightmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.flightmanagement.models.Flight;
import com.cognizant.flightmanagement.models.Passenger;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@org.springframework.stereotype.Service
@Setter
@Getter
public class FMService {
	
	@Autowired
	private Flight flight;
	
	public boolean addPassenger(Passenger passenger) {
		if(flight.getFlightType().equals("ECONOMY")) {
			log.info(passenger+" added");
			return flight.addPassenger(passenger);
		}
		else {
			if(passenger.isVip()) {
				log.info(passenger+" added");
				return flight.addPassenger(passenger);
			}
			else {
				log.error(passenger+" not added");
				return false;
			}
		}
	}
	public boolean removePassenger(Passenger passenger) {
		if(!passenger.isVip()) {
			log.info(passenger+" deleted");
			return flight.removePassenger(passenger);
		}else {
			log.error(passenger+" not deleted");
			return false;
		}
	}
	public Object getFlight() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
