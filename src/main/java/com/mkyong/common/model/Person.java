package com.mkyong.common.model;

import java.util.Date;

public class Person {

	private String firstName;
	private String middleName;
	private String lastName;
	/*private Date dob;
	private String createdFor;*/
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
/*	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getCreatedFor() {
		return createdFor;
	}
	public void setCreatedFor(String createdFor) {
		this.createdFor = createdFor;
	}*/
	
}
