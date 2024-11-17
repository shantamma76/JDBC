package com.xworkz.register.Repository;

import com.xworkz.register.dto.RegisterDTO;

public interface RegisterRepo {
	
	boolean save(RegisterDTO registerDTO);

}
