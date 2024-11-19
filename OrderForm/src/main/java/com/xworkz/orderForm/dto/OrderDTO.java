package com.xworkz.orderForm.dto;

public class OrderDTO {

	private String name;
	private String email;
	private String phone;
	private String address;
	private String city;
	private int pincode;
	private String item;
	private int quantity;

	public OrderDTO(String name, String email, String phone, String address, String city, int pincode, String item,
			int quantity) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.item = item;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderDTO [name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address + ", city="
				+ city + ", pincode=" + pincode + ", item=" + item + ", quantity=" + quantity + "]";
	}

}
