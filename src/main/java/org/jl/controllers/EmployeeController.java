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
import org.jl.dao.to.EmployeeAudit;
import org.jl.dao.to.Employees;
import org.jl.dao.to.Jobs;
import org.jl.forms.EmployeeAddForm;
import org.jl.service.EmployeeService;
import org.jl.service.LoginService;


@SessionAttributes("loginuser")
@Controller

public class EmployeeController {

	
	 
	 @Autowired
	    private EmployeeService empSer;
	 @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {
	
     List<Employees> empList = empSer.getAllEmployees();
     model.addAttribute("empList", empList);
     System.out.println("Entered getAllEmployees " );
     //System.out.println(empDAO());
	 return "allEmployees";
	}
	 
	 @RequestMapping(value = "/displayAddEmployee", method = RequestMethod.GET)
		public ModelAndView displayAddEmployeeForm(@ModelAttribute("loginuser") Employees emp) {
		
		 ModelAndView model = new ModelAndView("displayEmployeeAddForm");
		 List<Jobs>  jobTitList = empSer.getAllJobTitles();
		 List<Departments>  depList = empSer.getAllDepartments();
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
		emps.setFirstName(form.getfName());
		emps.setLastName(form.getlName());
		emps.setEmployeeId(form.getEmployeeId());
		emps.setEmail(form.getEmail());
		emps.setHireDate(form.getHireDate());
		emps.setDepartments(form.getDepId());
		emps.setJobs(form.getJobId());
		emps.setPassword(form.getPassword());
		//System.out.println("Jobs is " +form.getJobId());
		EmployeeAudit audit = new EmployeeAudit();
		audit.setAddedby(emp.getFirstName()+emp.getLastName());
		audit.setAddeddate(new java.util.Date());
		audit.setAudid(new Integer(0));
		 ModelAndView model = new ModelAndView("addEmployeeSuccess");
		 empSer.addEmployee(emps,audit);
		 System.out.println("Entered addEmployee ");
		 return model;
		} 
	
	
	
}



