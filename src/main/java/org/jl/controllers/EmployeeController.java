package org.jl.controllers;

import org.jl.dao.EmployeesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import javax.validation.Valid;

import org.jl.dao.to.Employees;
import org.jl.forms.EmployeeAddForm;


@Controller
public class EmployeeController {

	
	 @Autowired
	    private EmployeesDAO empDAO;
	 @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {
	
     List<Employees> empList = empDAO.getAllEmployees();
     model.addAttribute("empList", empList);
     System.out.println("Entered getAllEmployees " );
     //System.out.println(empDAO());
	 return "allEmployees";
	}
	 
	 @RequestMapping(value = "/displayAddEmployee", method = RequestMethod.GET)
		public String addEmployee(@Valid @ModelAttribute EmployeeAddForm form ) {
		
	     List<Employees> empList = empDAO.getAllEmployees();
	     //model.addAttribute("empList", empList);
	     System.out.println("Entered getAllEmployees " );
		 return "allEmployees";
		} 
	
	
	
	
}



