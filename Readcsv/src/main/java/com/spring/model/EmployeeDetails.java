package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String empName;
	private String empId;
	private String empDepartment;
	private String empAddress;
	private String empSalary;
	
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeDetails(int id, String empName, String empId, String empDepartment, String empAddress,
			String empSalary) {
		super();
		this.id = id;
		this.empName = empName;
		this.empId = empId;
		this.empDepartment = empDepartment;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
	}
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", empName=" + empName + ", empId=" + empId + ", empDepartment="
				+ empDepartment + ", empAddress=" + empAddress + ", empSalary=" + empSalary + "]";
	}
	
	
	
}
