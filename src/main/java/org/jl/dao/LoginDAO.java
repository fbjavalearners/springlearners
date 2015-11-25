package org.jl.dao;
import org.jl.dao.to.Employees;
import org.jl.forms.LoginForm;

import java.util.List;

public interface LoginDAO {

	public Employees isValidUser(LoginForm form );
	
}
