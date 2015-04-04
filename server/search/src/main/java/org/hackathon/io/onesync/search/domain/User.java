package org.hackathon.io.onesync.search.domain;

import java.io.Serializable;
import java.util.Map;

/*
 * User model class
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * userId : global userId assigned subscription: A Map of cloudIds to access
	 * tokens for the given user
	 */
	private int userId;

	private String username;

	private String password;

	private String firstName;

	private String lastName;
	
	private String email;

	private Map<Integer, String> subscription;

	public User() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Map<Integer, String> getSubscription() {
		return subscription;
	}

	public void setSubscription(Map<Integer, String> subscription) {
		this.subscription = subscription;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
