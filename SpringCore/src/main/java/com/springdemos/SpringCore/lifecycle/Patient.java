package com.springdemos.SpringCore.lifecycle;

public class Patient {

	int id;

	public int getId() {
	
		return id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Set");
	}
	//Init Method
	public void hi() {
		System.out.println("Hii");
	}
	
	//Destroy Method
	public void bye() {
		System.out.println("Bye");
	}
}
