package org.jl.formatters;

import java.text.ParseException;
import java.util.Locale;

import org.jl.dao.DepartmentsDAO;
import org.jl.dao.JobsDAO;
import org.jl.dao.to.Departments;
import org.jl.dao.to.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class JobFormatter implements Formatter<Jobs> {

	@Autowired
	   private JobsDAO jobsDAO;
	public JobsDAO getJobsDAO() {
		return jobsDAO;
	}

	public void setJobsDAO(JobsDAO jobsDAO) {
		this.jobsDAO = jobsDAO;
	}

	public String print(Jobs arg0, Locale arg1) {
		// TODO Auto-generated method stub
		System.out.println("Entered pritn ");
		return arg0.getJobId();
	}

	public Jobs parse(String arg0, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("jobId is "+arg0);
		System.out.println("jobsDAO "+jobsDAO);
		Jobs de = jobsDAO.getJobById(arg0);
		//System.out.println(" de is "+de);
		return de;
	}
     
    
}