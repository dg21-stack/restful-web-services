package com.in28minutes.rest.webservices.restfulwebservices.versioning;

public class Name {
	private String FirstName;
	private String lastName;
	
	public Name(String firstName, String lastName) {
		super();
		this.FirstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Name [FirstName=" + FirstName + ", lastName=" + lastName + "]";
	}
	
}
