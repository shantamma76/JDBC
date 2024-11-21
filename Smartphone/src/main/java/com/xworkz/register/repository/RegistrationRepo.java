package com.xworkz.register.repository;

import com.xworkz.register.dto.RegistrationDTO;

public interface RegistrationRepo {

	boolean save(RegistrationDTO dto);
	 
	 String getlistById(int id);
	 
	 String getemailByPhone(long phone);
	 
	 String  checkEmailPassword(String email, String password);
	 
	 int deleteById(int id);
	 
	String updatedByemail(String name,String address,String email);
	}
