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
import org.hibernate.transform.AliasToBeanResultTransformer;
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

	public List getAllJobs() {
		
		    	DetachedCriteria cri =  	DetachedCriteria.forClass(Jobs.class);
		    	
		    	  ProjectionList projList = Projections.projectionList();
			         projList.add(Projections.property("jobId"));
			         projList.add(Projections.property("jobTitle"));
			         cri.setProjection(Projections.distinct(projList));
		         cri.setResultTransformer(new AliasToBeanResultTransformer(
		                 Jobs.class));
		        
		         
		       
		         
		         
		         
		         
		         
		         
		         
		         
                System.out.println("Entered getAllDepartments ");
		        return hibernateTemplate.findByCriteria(cri);
		
	}

	

}
