package com.example.DariuszFe.domain;

public class rejestracja {
	
	private String login = " ";
	private String password =  " ";
	private String email = " ";

	
	public rejestracja() {
		super();
	}
	
	public rejestracja(String login,String password,String email) {
		super();
		this.login = login;
		this.password = password;
		this.email = email;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean validate() {
		if(login.trim().equals(this.login)&&password.trim().equals(this.password)){
			return true;
		}
		return false;
	}
}
