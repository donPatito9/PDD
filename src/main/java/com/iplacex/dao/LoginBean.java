package com.iplacex.dao;

public class LoginBean {
	private String username;
	private String password;
	
	public String getUsername() {
		
		return username;
	}
	public void setUsername(String username) {
		if(username.isEmpty()) {
			System.out.println("Campo usuario Vacio"); 
			
		}else {
		
		      this.username = username;
		}
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.isEmpty()) {
			System.out.println("Campo password Vacio"); 
			
		}else {
		
		this.password = password;
	}

    }
}
