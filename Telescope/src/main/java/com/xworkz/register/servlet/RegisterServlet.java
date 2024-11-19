package com.xworkz.register.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.register.dto.RegisterDTO;

import com.xworkz.register.service.RegisterServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/save")
public class RegisterServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String email = req.getParameter("email");

		String mobile = req.getParameter("mobile");

		String age = req.getParameter("age");
		int convertedAge = Integer.valueOf(age);

		String address = req.getParameter("address");

		RegisterDTO registerDTO = new RegisterDTO(firstName, lastName, email, convertedAge, mobile, address);

		RegisterServiceImpl registerServiceimpl = new RegisterServiceImpl();
		boolean saved = registerServiceimpl.saveData(registerDTO);

		System.out.println("First Name:" + firstName);
		System.out.println("Last Name:" + lastName);
		System.out.println("email:" + email);
		System.out.println("Age:" + age);
		System.out.println("mobile:" + mobile);
		System.out.println("address:" + address);
	}
}
