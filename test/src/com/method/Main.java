package com.method;

class Company{
	void sal(double sal){
		System.out.println("Salary is " + sal);
	}
	void sal(int sal){
		System.out.println("Salary is " +(sal));
	}
}
class Acc extends Company{
	void sal(double sal,double bonus){
		System.out.println("Salary is "+ (sal+bonus));
	}
}


public class Main {
	public static void main(String[] args) {
		Acc acc = new Acc();
		Company company = new Company();
		acc.sal(10000,+1000);
		company.sal(20000.44);
		company.sal(20000);
		
	}
}
