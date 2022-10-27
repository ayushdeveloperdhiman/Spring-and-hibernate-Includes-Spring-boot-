package com.ayush;

public class Employee {
	
	private int empId;
	private String empName;
	private Department DepartmentName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, Department departmentName) {
		super();
		this.empId = empId;
		this.empName = empName;
		DepartmentName = departmentName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Department getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(Department departmentName) {
		DepartmentName = departmentName;
	}
	
	

}
