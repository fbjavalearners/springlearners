package org.jl.formatters;

import java.text.ParseException;
import java.util.Locale;

import org.jl.dao.DepartmentsDAO;
import org.jl.dao.to.Departments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class DepFormatter implements Formatter<Departments> {

	@Autowired
	   private DepartmentsDAO deptDAO;
	
	public String print(Departments arg0, Locale arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public DepartmentsDAO getDeptDAO() {
		return deptDAO;
	}

	public void setDeptDAO(DepartmentsDAO deptDAO) {
		this.deptDAO = deptDAO;
	}

	public Departments parse(String arg0, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		Departments de = deptDAO.getDepartmentById(Integer.parseInt(arg0));
		return de;
	}
     
    
}