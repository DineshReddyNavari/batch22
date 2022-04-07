package com.zensar.employee;

public class Manager extends Employee{
	private int Incentive;

	public Manager() {
		super();
	}



	public Manager(int getEmployeeId, String getEmployeeName,int getEmployeeSalary, int incentive) {
		super(getEmployeeId,getEmployeeName,getEmployeeSalary);
		Incentive = incentive;
	}

	public int getIncentive() {
		return Incentive;
	}

	public void setIncentive(int incentive) {
		Incentive = incentive;
	}

	@Override
	public String toString() {
		return "Manager [Incentive=" + Incentive + "]";
	}
	 
	public int CalculateSalary() {
		return (super.getEmployeeSalary()+Incentive);
	}

}

