package com.zensar.client;

import com.zensar.employee.Manager;
import com.zensar.employee.Labour;

public class Client {
	public static void main(String[] args) {
	
		Manager manager = new Manager(1001, "DineshReddy", 25000, 15000);
		Labour labour = new Labour(3001, "LokeshReddy", 20000, 10, 100);
		int ManagerSalary = manager.CalculateSalary();
		System.out.println("MANAGER SALARY IS : "+ManagerSalary);
		int LabourSalary = labour.CalculateSalary();
		System.out.println("SALARY OF LABOUR IS : "+LabourSalary);
		System.out.println("Thankyou!!");
		
	}

}
