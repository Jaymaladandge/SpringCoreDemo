package com.entities;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Permanent")
@Scope("prototype")
public class PermanentAddress implements Address {

	private String city;
	private String state;

	public PermanentAddress() {
		System.out.println("===============PermanentAddress()================");
	}

	public PermanentAddress(String city, String state) {
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
		return "PermanentAddress [city=" + city + ", state=" + state + "]";
	}

}
