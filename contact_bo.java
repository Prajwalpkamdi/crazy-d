package com.bo;

public class contact_bo 
{
	private String name,number,email,feedback;

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public String getEmail() {
		return email;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "contact [name=" + name + ", number=" + number + ", email=" + email + ", feedback=" + feedback + "]";
	}

	public contact_bo(String name, String number, String email, String feedback) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
		this.feedback = feedback;
	}

	public contact_bo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
