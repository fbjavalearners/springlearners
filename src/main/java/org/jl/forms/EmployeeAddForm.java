package org.jl.forms;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.jl.dao.to.Departments;
import org.jl.dao.to.Jobs;

public class EmployeeAddForm {

	
	private int employeeId;
	
	
	
	private String email;
	
	private String password;
	
	
	private String fName;
	
	private String lName;
	
	private String phoneNumber;
	
	private Date hireDate;
	
	private Jobs jobId;
	
	private String salary;
	private String commissionPct;
	private String mgrId;
	private Departments depId;
	private List<Jobs> jobTitList;
	private List<Departments> deptList;
	
	
	public List<Jobs> getJobTitList() {
		return jobTitList;
	}

	public void setJobTitList(List<Jobs> jobTitList) {
		this.jobTitList = jobTitList;
	}

	public List<Departments> getDeptList() {
		return deptList;
	}

	public void setDeptList(List<Departments> deptList) {
		this.deptList = deptList;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Jobs getJobId() {
		return jobId;
	}

	public void setJobId(Jobs jobId) {
		this.jobId = jobId;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	

	public String getCommissionPct() {
		return commissionPct;
	}

	public void setCommissionPct(String commissionPct) {
		this.commissionPct = commissionPct;
	}

	public String getMgrId() {
		return mgrId;
	}

	public void setMgrId(String mgrId) {
		this.mgrId = mgrId;
	}

	public Departments getDepId() {
		return depId;
	}

	public void setDepId(Departments depId) {
		this.depId = depId;
	}

	public EmployeeAddForm(){
		
	}

	public EmployeeAddForm(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
