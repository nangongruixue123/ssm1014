package com.yuan.mapper;

public class User {
	private String username;
	
	private String passdword;
	
	private String salt;
	
	

	public User() {
		super();
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassdword() {
		return passdword;
	}

	public void setPassdword(String passdword) {
		this.passdword = passdword;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
	
	
}
