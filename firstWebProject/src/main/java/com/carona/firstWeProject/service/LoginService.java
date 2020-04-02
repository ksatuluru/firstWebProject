package com.carona.firstWeProject.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component 
@Service
public class LoginService {
	
	public boolean validate (String user,String pw)
	{
		if (user.equalsIgnoreCase("kamal") &&
		   pw.equalsIgnoreCase("passw0rd"))
				return true;
		return false;
	} 
	

}
