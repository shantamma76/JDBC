package com.xworkz.orderForm.service;

import com.xworkz.orderForm.dto.OrderDTO;
import com.xworkz.orderForm.repository.OrderRepoImpl;

public class OrderServiceImpl implements OrderService {

	@Override
	public boolean valideDate(OrderDTO orderDTO) {
		System.out.println("Running valideDate in OrderServiceImpl ");

		OrderRepoImpl orderRepoImpl = new OrderRepoImpl();
		boolean saved = orderRepoImpl.valideAndSave(orderDTO);
		System.out.println("saved in registerServiceImpl:" + saved);

		String name = orderDTO.getName();
		if (name != null && !name.isEmpty() && name.length() > 6 && name.length() < 14) {
			System.out.println("firstName is valide");
			saved = true;
		} else {
			System.err.println("firstName is in-valide");
			saved = false;
		}

		String email = orderDTO.getEmail();
		if (email == null && !(email.contains("@") && email.endsWith(".com") && email.indexOf('@') == 8)) {
			System.out.println("email is valide");
			saved = true;

		} else {
			System.err.println("email is in-valide");
			saved = false;
		}

		String phone = orderDTO.getPhone();
		if (phone != null && phone.length() == 10 && phone.startsWith("9")) {
			System.out.println("Phone number is valid");
		} else {
			System.err.println("Phone number is invalid");
			saved = false;
		}

		int pincode = orderDTO.getPincode();
		if (pincode > 4) {
			System.out.println("pincode is valid");
			saved = true;
		} else {
			System.err.println("pincode is invalid");
			saved = false;
		}
		return saved;

	}
}
