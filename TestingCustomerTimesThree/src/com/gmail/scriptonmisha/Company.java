package com.gmail.scriptonmisha;

import java.util.Arrays;

public class Company {
	private String name;
	private double budget;
	private Employee[] employees = new Employee[5];

	public Company(String name, double budget) {
		super();
		this.name = name;
		this.budget = budget;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public void addEmployee(Employee employee) {
		if (employee == null) {
			throw new IllegalArgumentException("employee not found");
		}
		double salary = 0;
		for (int i = 0; i < employees.length; i++) {
			salary += employee.getSalary();
			if (employees[i] == null) {
				if (salary <= getBudget()) {
					employees[i] = employee;
					return;
				}
			}
			// System.out.println(salary);
		}
	}

	public SalaryService getSalaryService() {
		SalaryService ss = new SalaryService();
		
		return ss;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", budget=" + budget + ", employees=" + Arrays.toString(employees) + "]";
	}

}
