package org.jl.dao.to;
// default package
// Generated Nov 29, 2015 5:12:45 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Employeeaudit generated by hbm2java
 */
@Entity
@Table(name = "EMPLOYEEAUDIT")
public class EmployeeAudit implements java.io.Serializable {

	private Integer audid;
	private String addedby;
	private Date addeddate;

	public EmployeeAudit() {
	}

	public EmployeeAudit(Integer audid) {
		this.audid = audid;
	}

	public EmployeeAudit(Integer audid, String addedby, Date addeddate) {
		this.audid = audid;
		this.addedby = addedby;
		this.addeddate = addeddate;
	}

	@Id
	@Column(name = "AUDID", unique = true, nullable = false, precision = 22, scale = 0)
	public Integer getAudid() {
		return this.audid;
	}

	public void setAudid(Integer audid) {
		this.audid = audid;
	}

	@Column(name = "ADDEDBY", length = 4000)
	public String getAddedby() {
		return this.addedby;
	}

	public void setAddedby(String addedby) {
		this.addedby = addedby;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ADDEDDATE", length = 7)
	public Date getAddeddate() {
		return this.addeddate;
	}

	public void setAddeddate(Date addeddate) {
		this.addeddate = addeddate;
	}

}
