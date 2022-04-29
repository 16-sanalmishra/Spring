package com.springdemos.SpringCore.constructorinjection;

public class Address {
	int housenumber;
	String street;
	String city;
	public Address(int housenumber, String street, String city) {
		super();
		this.housenumber = housenumber;
		this.street = street;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [housenumber=" + housenumber + ", street=" + street + ", city=" + city + "]";
	}

	
}
