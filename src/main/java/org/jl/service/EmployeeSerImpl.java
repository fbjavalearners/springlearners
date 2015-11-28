package org.jl.service;

import java.util.List;
import java.util.Map;

import org.jl.dao.EmployeesDAO;
import org.jl.dao.to.Employees;
import org.jl.dao.to.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeSerImpl implements EmployeeService{

	@Autowired
	EmployeesDAO dao;
	
	public List<Employees> getAllEmployees() {
		return dao.getAllEmployees();
	}
	
	public List<Jobs> getAllJobs() {
		return dao.getAllJobTitles();
	}

}
