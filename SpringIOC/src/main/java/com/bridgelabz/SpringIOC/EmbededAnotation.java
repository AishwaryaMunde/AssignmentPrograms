package com.bridgelabz.SpringIOC;

import javax.persistence.Embeddable;

@Embeddable   //if we use @Entity here then it will create new table
public class EmbededAnotation 
{
	String firstname;
	String middlename;
	String lastname;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
