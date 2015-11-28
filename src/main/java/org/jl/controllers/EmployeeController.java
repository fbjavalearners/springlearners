package org.jl.controllers;

import org.jl.dao.EmployeesDAO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.jl.dao.to.Departments;
import org.jl.dao.to.Employees;
import org.jl.dao.to.Jobs;
import org.jl.forms.EmployeeAddForm;


@SessionAttributes("loginuser")
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
		public ModelAndView displayAddEmployeeForm(@ModelAttribute("loginuser") Employees emp) {
		
		 ModelAndView model = new ModelAndView("displayEmployeeAddForm");
		 List<Jobs>  jobTitList = empDAO.getAllJobTitles();
		 List<Departments>  depList = empDAO.getAllDepartments();
	     EmployeeAddForm empform = new EmployeeAddForm();
	     empform.setJobTitList(jobTitList);
	     empform.setDeptList(depList);
	     model.addObject("empaddform", empform);
	     System.out.println("Entered displayAddEmployeeForm " +jobTitList);
		 return model;
		} 
	 @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
		public ModelAndView addEmployeeForm(@ModelAttribute("loginuser") Employees emp,@ModelAttribute("empaddform") EmployeeAddForm form) {
		Employees emps = new Employees();
		emps.setFirstName(form.getFirstName());
		emps.setLastName(form.getLastName());
		emps.setEmployeeId(form.getEmployeeId());
		emps.setEmail(form.getEmail());
		emps.setHireDate(form.getHireDate());
		emps.setDepartments(form.getDepId());
		emps.setJobs(form.getJobId());
		//System.out.println("Jobs is " +form.getJobId());
		
		 ModelAndView model = new ModelAndView("addEmployeeSuccess");
		 empDAO.addEmployee(emps);
		 System.out.println("Entered addEmployee ");
		 return model;
		} 
	
	
	
}



