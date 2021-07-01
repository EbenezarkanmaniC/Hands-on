package com.cognizant.flightmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cognizant.flightmanagement.models.Passenger;
import com.cognizant.flightmanagement.services.FMService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class FMController {
	
	@Autowired
	private FMService fmService;
	
	@PostMapping(value="/flights/business")
	public void addBussinessFlight(@RequestBody Passenger passenger) {
		fmService.getFlight().setFlightType("BUSINESS");
		fmService.addPassenger(passenger);
	}
	
	@PostMapping(value="/flights/economy")
	public void addEconomyFlight(@RequestBody Passenger passenger) {
		fmService.getFlight().setFlightType("ECONOMY");
		fmService.addPassenger(passenger);
	}
	
	@DeleteMapping(value="/flights/business")
	public void removeBussinessFlight(@RequestBody Passenger passenger) {
		fmService.getFlight().setFlightType("BUSINESS");
		fmService.removePassenger(passenger);
	}
	
	@DeleteMapping(value="/flights/economy")
	public void removeEconomyFlight(@RequestBody Passenger passenger) {
		fmService.getFlight().setFlightType("ECONOMY");
		fmService.removePassenger(passenger);
	}
}
