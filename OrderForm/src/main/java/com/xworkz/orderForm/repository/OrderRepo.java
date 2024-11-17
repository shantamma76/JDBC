package com.xworkz.orderForm.repository;

import com.xworkz.orderForm.dto.OrderDTO;

public interface OrderRepo {
	
	boolean valideAndSave(OrderDTO orderDTO);

}
