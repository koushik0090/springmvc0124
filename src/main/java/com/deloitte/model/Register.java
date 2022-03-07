package com.deloitte.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Register {
	
	@NotEmpty(message = "User Name Cannot Be Null")
	private String userName;

	@NotEmpty(message = "Password Cannot be Blank")
	@Size(min = 3,max = 6, message = "Password should be minimum of 3 and max of 6")
	@Pattern(regexp = "(?=.*[a-z])(?=.*[A-Z])")
	private String userPassword;
	
	@NotEmpty(message = "Email Cannot be Blank")
	private String userEmail;
	
	private String userAddress;
	
	@NotEmpty(message = "Phone Cannot be Blank")
	private String userPhone;
	
	private String userRole;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	

}
