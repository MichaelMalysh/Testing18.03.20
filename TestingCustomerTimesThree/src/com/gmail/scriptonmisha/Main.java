package com.gmail.scriptonmisha;


public class Main {

	public static void main(String[] args) {
		Company companyOne = new Company("Customer Times", 5000);
		
		companyOne.getSalaryService().pay(companyOne);
	}

}
