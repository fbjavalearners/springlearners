package org.jl.service;

import org.jl.dao.to.Employees;
import org.jl.forms.LoginForm;

public interface LoginService {

	
	public Employees isValidUser(LoginForm form );
	
	
	
}
