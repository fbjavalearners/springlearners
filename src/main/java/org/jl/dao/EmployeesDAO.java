package org.jl.dao;
import org.jl.dao.to.Departments;
import org.jl.dao.to.Employees;
import org.jl.dao.to.Jobs;

import java.util.List;
import java.util.Map;

public interface EmployeesDAO {

	public List<Employees> getAllEmployees();
	List<Jobs> getAllJobTitles();
	List<Departments> getAllDepartments();
	public void addEmployee(Employees emp );
	
}
