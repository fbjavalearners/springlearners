package org.jl.service;

import java.util.List;

import org.jl.dao.EmployeesDAO;
import org.jl.dao.LoginDAO;
import org.jl.dao.to.Employees;
import org.jl.forms.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginSerImpl implements LoginService{
    @Autowired
	LoginDAO logDao;
	
	public Employees isValidUser(LoginForm form) {
		// TODO Auto-generated method stub
		return logDao.isValidUser(form);
	}

	

}
