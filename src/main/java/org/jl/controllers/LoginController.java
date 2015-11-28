package org.jl.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.jl.dao.EmployeesDAO;
import org.jl.dao.to.Employees;
import org.jl.forms.LoginForm;
import org.jl.service.LoginService;

@SessionAttributes("loginuser")
@Controller
public class LoginController {

	 @Autowired
	    private LoginService loginSer;
	 @Autowired
	    private EmployeesDAO empDAO;
	 @RequestMapping(value="/login",method=RequestMethod.GET)
	 
	     public ModelAndView displayLogin()
	 
	     {
	 
	         ModelAndView model = new ModelAndView("loginForm");
	 
	         LoginForm loginForm = new LoginForm();
	 
	         model.addObject("loginForm", loginForm);
	 
	         return model;
	 
	     }
	 @RequestMapping(value="/login",method=RequestMethod.POST)
	 
     public ModelAndView executeLogin( @Valid @ModelAttribute("loginForm")  LoginForm loginForm,
    		 BindingResult result)
 
     {
 
         if(result.hasErrors()){
        	 return new ModelAndView("loginForm");
         }
		 
		 ModelAndView model = new ModelAndView();
           
         Employees emp = loginSer.isValidUser(loginForm);
       
         if(emp == null ){
        	  model.setViewName("loginForm");
        	  model.addObject("message", "Invalid User");
        	  
         }else{
        	 model.setViewName("homePage");
       	     model.addObject("loginuser", emp);
         }
      
         
         return model;
 
     }

	

	
	
	
}



