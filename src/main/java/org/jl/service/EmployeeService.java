package org.jl.service;
import org.jl.dao.to.Departments;
import org.jl.dao.to.EmployeeAudit;
import org.jl.dao.to.Employees;
import org.jl.dao.to.Jobs;

import java.util.List;

public interface EmployeeService {

	
	List<Employees> getAllEmployees();
	
	
	public List getAllJobs() ;
	
	public void addEmployee(Employees emp ,EmployeeAudit empAudit);
	
	

	
	List<Jobs> getAllJobTitles();
	List<Departments> getAllDepartments();

}
