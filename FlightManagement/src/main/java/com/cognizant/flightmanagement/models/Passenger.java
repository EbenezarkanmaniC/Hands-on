package com.cognizant.flightmanagement.models;

import lombok.Data;

@Data
public class Passenger {
	private String name;
	private boolean vip;
	public boolean isVip() {
		return this.vip;
	}
}
