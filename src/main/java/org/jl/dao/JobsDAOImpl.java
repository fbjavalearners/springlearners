package org.jl.dao;


import org.jl.dao.to.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class JobsDAOImpl implements JobsDAO{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	 public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	        this.hibernateTemplate = hibernateTemplate;
	    }
	
	public Jobs getJobById(String jobId){
		System.out.println("jobId is :: "+jobId);
		return hibernateTemplate.get(Jobs.class,jobId);
		
		
		
	}



}
