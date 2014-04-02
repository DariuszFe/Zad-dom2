package com.example.DariuszFe.domain;

public class User {
	
	private String login = " ";
	private String password = " ";
	
	public User() {
		super();
	}
	
	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public String getlogin() {
		return login;
	}
	public void setlogin(String login) {
		this.login = login;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	
	public boolean validate() {
		if(login.trim().equals("Dariusz")&&password.trim().equals("placki")){
			return true;
		}
		return false;
	}
}
