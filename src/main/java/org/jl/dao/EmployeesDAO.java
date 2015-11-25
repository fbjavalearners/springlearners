package org.jl.dao;
import org.jl.dao.to.Departments;
import org.jl.dao.to.Employees;
import org.jl.dao.to.Jobs;

import java.util.List;

public interface EmployeesDAO {

	public List<Employees> getAllEmployees();
	public List<Jobs> getAllJobs();
	
	
}
