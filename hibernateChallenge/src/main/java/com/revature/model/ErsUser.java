package com.revature.model;

import java.awt.Image;
import java.util.Scanner;

public class ErsUser implements User {
	private int id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private UserRole role;

	public ErsUser(int id, String username, String password, String firstName, String lastName,
			String email, UserRole role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.role = role;
	}

	public ErsUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public User login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean viewHomePage() {
		// TODO Auto-generated method stub
		return false;
	}

	public User logout() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean submitReimbursementReq(Reimbursement rbmt) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean uploadImage(Image img) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean viewPendingReimbursementReqs() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean viewResolvedReimbursementReqs() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean viewInfo() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateInfo(Scanner s) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean reviewPendingReimbursementReqs() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean viewImage(Reimbursement rmbmt) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean viewAllPendingReimbursementReqs() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean viewAllResolvedReimbursementReqs() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean viewAllEmployees() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean viewReimbursementReqs(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
