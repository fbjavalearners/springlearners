package org.jl.dao;

import org.jl.dao.to.Employees;
import org.jl.forms.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LoginDAOImpl implements LoginDAO{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	 public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	        this.hibernateTemplate = hibernateTemplate;
	    }
	
	public Employees isValidUser(LoginForm form) {
		// TODO Auto-generated method stub
		 Object[] params = {form.getEmail(),form.getPassword()};
	        List users = hibernateTemplate.find("FROM Employees where email=? and password=?",params);
	        if(users.size()<=0){
	            System.out.println("Invalid ");
	            return null;
	        }else{
	            System.out.println("valid User");
	            return (Employees) users.get(0);
	        }
		
		
	}
	
	

}
