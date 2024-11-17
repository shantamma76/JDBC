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
		return saved;

	}
}
