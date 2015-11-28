package org.jl.dao;
import org.jl.dao.to.Departments;
import org.jl.dao.to.Employees;
import org.jl.forms.LoginForm;

import java.util.List;

public interface DepartmentsDAO {

	public Departments getDepartmentById(int deptId );
	
}
