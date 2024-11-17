package com.xworkz.register.service;

import com.xworkz.register.Repository.RegisterRepoImpl;
import com.xworkz.register.dto.RegisterDTO;

public class RegisterServiceImpl implements RegisterService {

	@Override
	public boolean saveData(RegisterDTO registerDTO) {

		RegisterRepoImpl registerRepoImpl = new RegisterRepoImpl();
		boolean saved = registerRepoImpl.save(registerDTO);
		System.out.println("Saved in RegisterServiceImpl:" + saved);

		return saved;
	}

}
