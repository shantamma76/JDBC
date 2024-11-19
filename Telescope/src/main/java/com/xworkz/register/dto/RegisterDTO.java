package com.xworkz.register.dto;

public class RegisterDTO {

	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private String mobileNo;
	private String address;

	public RegisterDTO(String firstName, String lastName, String email, int age, String mobileNo, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
		this.mobileNo = mobileNo;
		this.address = address;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "RegisterDTO [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", age=" + age
				+ ", mobileNo=" + mobileNo + ", address=" + address + "]";
	}

}