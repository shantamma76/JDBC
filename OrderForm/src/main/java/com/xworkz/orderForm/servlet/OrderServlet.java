package com.xworkz.orderForm.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.orderForm.dto.OrderDTO;
import com.xworkz.orderForm.service.OrderServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/order")
public class OrderServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		long convertedPhone = Long.valueOf(phone);

		String address = req.getParameter("address");
		String city = req.getParameter("city");
		String pincode = req.getParameter("pincode");
		int convertedPincode = Integer.valueOf(pincode);

		String itemName = req.getParameter("item");
		String quantity = req.getParameter("quantity");
		int convertedQuantity = Integer.valueOf(quantity);

		OrderDTO orderDTO = new OrderDTO(name, email, convertedPhone, address, city, convertedPincode, itemName,
				convertedQuantity);

		OrderServiceImpl orderServiceImpl = new OrderServiceImpl();
		orderServiceImpl.valideDate(orderDTO);

		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.forward(req, res);

		System.out.println("Name:" + name);
		System.out.println("Email" + email);
		System.out.println("Phone:" + phone);
		System.out.println("Address:" + address);
		System.out.println("City:" + city);
		System.out.println("Pincode:" + pincode);
		System.out.println(" Item:" + itemName);
		System.out.println("Quantity:" + quantity);

	}
	}
