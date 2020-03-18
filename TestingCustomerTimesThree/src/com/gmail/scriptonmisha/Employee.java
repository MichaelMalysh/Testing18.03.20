package com.gmail.scriptonmisha;

public class Employee {
	private double ratePerHour;
	private int workdays;

	public Employee(double ratePerHour, int workdays) {
		super();
		this.ratePerHour = ratePerHour;
		this.workdays = workdays;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	public int getWorkdays() {
		return workdays;
	}

	public void setWorkdays(int workdays) {
		this.workdays = workdays;
	}

	public double getSalary() {
		return getRatePerHour() * getWorkdays() * 8;
	}

	@Override
	public String toString() {
		return " Employee [salary: "+getSalary()+  "]";
	}
	
}
