package com.bridgelabz.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Userdata 
{
	private String FirstName;
	private String LastName;
	@Id
	private String MobileNo; 
	private String EmailId;
	private String UserName;
	private String Password;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Userdata [FirstName=" + FirstName + ", LastName=" + LastName + ", MobileNo=" + MobileNo + ", EmailId="
				+ EmailId + ", UserName=" + UserName + ", Password=" + Password + "]";
	}
}
