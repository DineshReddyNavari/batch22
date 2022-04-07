package com.zensar.employee;

public class Employee {
	private int EmployeeId;
	private String EmployeeName;
	private int EmployeeSalary;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, int employeeSalary) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeSalary = employeeSalary;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public int getEmployeeSalary() {
		return EmployeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		EmployeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeSalary="
				+ EmployeeSalary + "]";
	}

	public int CalculateSalary() {
		return 0;
	}
}
