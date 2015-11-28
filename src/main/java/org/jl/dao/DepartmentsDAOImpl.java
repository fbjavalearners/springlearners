package org.jl.dao;


import org.jl.dao.to.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public class DepartmentsDAOImpl implements DepartmentsDAO{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	 public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	        this.hibernateTemplate = hibernateTemplate;
	    }
	
	public Departments getDepartmentById(int deptId){
		
		return hibernateTemplate.get(Departments.class,deptId);
		
		
		
	}



}
