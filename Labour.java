package com.zensar.employee;

public class Labour extends Employee {
	private int hours;
	private int rate;

	public Labour() {
		super();
	}

	public Labour(int getEmployeeId, String getEmployeeName, int getEmployeeSalary,int hours, int rate) {
		super(getEmployeeId,getEmployeeName,getEmployeeSalary);
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Labour [hours=" + hours + ", rate=" + rate + "]";
	}
@Override
	public int CalculateSalary() {
		return super.getEmployeeSalary()+hours*rate;
	}
	
}
