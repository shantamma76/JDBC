package com.xworkz.register.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.register.service.RegistrationServiceimpl;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String address=req.getParameter("address");
		String email=req.getParameter("email");
		
		RegistrationServiceimpl registrationService = new RegistrationServiceimpl();
        String ref = registrationService.updatedByemail(name,address,email);
        
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/update.jsp");
        requestDispatcher.forward(req, resp);
	}

}
