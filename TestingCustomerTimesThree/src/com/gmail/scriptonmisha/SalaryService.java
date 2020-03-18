package com.gmail.scriptonmisha;

import java.util.Scanner;

public class SalaryService {
	
	public void pay(Company company) {
		Scanner sc = new java.util.Scanner(System.in);
		System.out.println("input developer bonus in format: #,###");
		double bonus = sc.nextDouble();
		Employee manager = new Employee(5.3, 5);
		Employee developer = new Employee(2.6+bonus, 6);
		Employee scrumMaster = new Employee(7.0, 3);
		
		try {
			company.addEmployee(manager);
			company.addEmployee(developer);
			company.addEmployee(scrumMaster);
		}catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(company);
		sc.close();
	}
}
