package org.jl.service;

import org.jl.dao.EmployeeAuditDAO;
import org.jl.dao.to.EmployeeAudit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class EmployeeAuditSerImpl implements EmployeeAuditService{
	@Autowired
	EmployeeAuditDAO dao;
	public void addEmployeeAudit(EmployeeAudit empAudit) {
		dao.addEmployeeAudit(empAudit);
		
	}

}
