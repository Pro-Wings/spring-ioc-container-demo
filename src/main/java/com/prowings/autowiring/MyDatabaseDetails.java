package com.prowings.autowiring;

public class MyDatabaseDetails {
	
	String username;
	String url;
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "MyDatabaseDetails [username=" + username + ", url=" + url + ", password=" + password + "]";
	}

	
	
}
