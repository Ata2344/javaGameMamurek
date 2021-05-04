package Entities.Concrete;

import java.util.Date;

import Entities.Abstract.Entity;

public class User implements Entity {
	int id;
	String firstName;
	String lastName;
	String email;
	Date birthDayYear;
	String nationalityId;
	String userName;
	String password;
	String campaignCode;
	
	public User(int id,String userName, String firstName,String lastName, String email,  String password,String nationalityId,Date birthDayYear,String campaignCode) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.nationalityId=nationalityId;
		this.birthDayYear= birthDayYear;
		this.campaignCode=campaignCode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthDayYear() {
		return birthDayYear;
	}
	public void setBirthDayYear(Date birthDayYear) {
		this.birthDayYear = birthDayYear;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getCampaignCode() {
		return campaignCode;
	}
	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}
}