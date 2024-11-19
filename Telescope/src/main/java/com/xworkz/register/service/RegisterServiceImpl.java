package com.xworkz.register.service;

import com.xworkz.register.Repository.RegisterRepoImpl;
import com.xworkz.register.dto.RegisterDTO;

public class RegisterServiceImpl implements RegisterService {

	@Override
	public boolean saveData(RegisterDTO registerDTO) {

		RegisterRepoImpl registerRepoImpl = new RegisterRepoImpl();
		boolean saved = registerRepoImpl.save(registerDTO);
		System.out.println("Saved in RegisterServiceImpl:" + saved);

		String firstName = registerDTO.getFirstName();
		if (firstName != null && !firstName.isEmpty() && firstName.length() > 6 && firstName.length() < 14) {
			System.out.println("firstName is valide");
			saved = true;
		} else {
			System.err.println("firstName is in-valide");
			saved = false;
		}

		String mobileNo = registerDTO.getMobileNo();
		if (mobileNo != null && mobileNo.length() == 10 && mobileNo.startsWith("9")) {
			System.out.println("mobileNo is valid");
		} else {
			System.err.println("mobileNo is invalid");
			saved = false;
		}

		String email = registerDTO.getEmail();
		if(email == null && !(email.contains("@") && email.endsWith(".com") && email.indexOf('@')==8)) {
			System.out.println("email is valide");
			saved = true;
		} 
		else {
			System.err.println("email is invalide");
			saved = false;
		}

		int age = registerDTO.getAge();
		if (age > 5) {
			System.out.println("Age is valid");
			saved = true;
		} else {
			System.err.println("Age is invalid");
			saved = false;
		}

		return saved;
	}
}
