package com.xworkz.register.service;

import com.xworkz.register.dto.RegistrationDTO;
import com.xworkz.register.repository.RegistrationRepoImpl;

public class RegistrationServiceimpl implements RegistrationService {

	@Override
	public boolean save(RegistrationDTO dto) {
		RegistrationRepoImpl registrationRepoImpl = new RegistrationRepoImpl();
		registrationRepoImpl.save(dto);
		return true;
	}

	@Override
	public String getlistById(int id) {
		String valid = null;
		if (id != 0) {
			System.out.println("data is not null");
			RegistrationRepoImpl registrationRepoImpl = new RegistrationRepoImpl();
			valid = registrationRepoImpl.getlistById(id);
			System.out.println(valid);

		} else {
			System.out.println("data is null");
		}
		return valid;
	}

	@Override
	public String getemailByPhone(long phoneno) {

		String valid = null;
		if (phoneno != 0) {
			System.out.println("data is not null");
			RegistrationRepoImpl registrationRepoImpl = new RegistrationRepoImpl();
			valid = registrationRepoImpl.getemailByPhone(phoneno);
		} else {
			System.out.println("data is null");
		}
		return valid;
	}

	@Override
	public String checkEmailPassword(String email, String password) {
		String valid = null;

		RegistrationRepoImpl registrationRepo = new RegistrationRepoImpl();
		String res = registrationRepo.checkEmailPassword(email, password);
		return res;
	}

	@Override
	public int deleteById(int id) {
		RegistrationRepoImpl registrationRepo = new RegistrationRepoImpl();
		int res = registrationRepo.deleteById(id);
		return res;
	}

	@Override
	public String updatedByemail(String name, String address, String email) {
		String valid = null;
		RegistrationRepoImpl registrationRepo = new RegistrationRepoImpl();
		String res = registrationRepo.updatedByemail(name, address, email);
		return valid;
	}

}