package org.jl.dao;

import org.jl.dao.to.EmployeeAudit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class EmployeeAuditDAOImpl implements EmployeeAuditDAO{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	public void addEmployeeAudit(EmployeeAudit empAudit) {
		System.out.println("Entered audit method ");
		hibernateTemplate.save(empAudit);
		
	}

	

}
