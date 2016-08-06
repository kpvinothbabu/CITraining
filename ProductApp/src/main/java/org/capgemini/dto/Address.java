package org.capgemini.dto;

public class Address {
	
	//instance variables
	private String addressLine;
	private String city;
	
	//No arg Constructor
	public Address(){}
	
	//Constructor with parameter
	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	
	//Getters and Setters
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", city=" + city + "]";
	}
	
	

}
