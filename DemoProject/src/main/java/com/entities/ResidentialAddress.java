package com.entities;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Residential")
@Scope("prototype")
public class ResidentialAddress implements Address {

	private String city;
	private String state;

	public ResidentialAddress() {
		System.out.println("=================ResidentialAddress()==================");
	}

	public ResidentialAddress(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "ResidentialAddress [city=" + city + ", state=" + state + "]";
	}

}
