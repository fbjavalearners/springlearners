package org.jl.service;

import java.util.List;
import java.util.Map;

import org.jl.dao.EmployeeAuditDAO;
import org.jl.dao.EmployeesDAO;
import org.jl.dao.to.Departments;
import org.jl.dao.to.EmployeeAudit;
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
	@Autowired
	EmployeeAuditDAO auditDao;
	
	public List<Employees> getAllEmployees() {
		return dao.getAllEmployees();
	}
	
	public List<Jobs> getAllJobs() {
		return dao.getAllJobTitles();
	}

	public void addEmployee(Employees emp,EmployeeAudit empAudit) {
		dao.addEmployee(emp);
		System.out.println("After adding employee ");
		auditDao.addEmployeeAudit(empAudit);
		System.out.println("After adding audit ");
		
	}

	public List<Jobs> getAllJobTitles() {
		// TODO Auto-generated method stub
		return dao.getAllJobTitles();
	}

	public List<Departments> getAllDepartments() {
		// TODO Auto-generated method stub
		return dao.getAllDepartments();
	}

}
