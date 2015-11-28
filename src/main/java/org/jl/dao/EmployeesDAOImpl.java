package org.jl.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.transform.AliasToBeanConstructorResultTransformer;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.transform.Transformers;
import org.jl.dao.to.*;
import org.jl.forms.JobForm;


public class EmployeesDAOImpl implements EmployeesDAO{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	 public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	        this.hibernateTemplate = hibernateTemplate;
	    }
	
	public List<Employees> getAllEmployees(){
		
		return hibernateTemplate.find("from Employees");
		
		
		
	}

	public List getAllJobTitles() {
		
		    	DetachedCriteria cri =  	DetachedCriteria.forClass(Jobs.class);
		    	
		    	  ProjectionList projList = Projections.projectionList();
			         projList.add(Projections.property("jobId"),"jobId");
			         projList.add(Projections.property("jobTitle"),"jobTitle");
			         cri.setProjection(Projections.distinct(projList));
		         cri.setResultTransformer(Transformers.aliasToBean(Jobs.class));
		         
		       
		         
		         
		         
		         
		         
		         
		         
		         
                System.out.println("Entered getAllDepartments ");
		        return hibernateTemplate.findByCriteria(cri);
		
	}
	public List getAllDepartments() {
		
    	DetachedCriteria cri =  	DetachedCriteria.forClass(Departments.class);
    	
    	  ProjectionList projList = Projections.projectionList();
	         projList.add(Projections.property("departmentId"),"departmentId");
	         projList.add(Projections.property("departmentName"),"departmentName");
	         cri.setProjection(Projections.distinct(projList));
         cri.setResultTransformer(Transformers.aliasToBean(Departments.class));
         
       
         
         
         
         
         
         
         
         
        System.out.println("Entered getAllDepartments ");
        return hibernateTemplate.findByCriteria(cri);

}
	public void addEmployee(Employees emp ){
		hibernateTemplate.save(emp);
	}

}
