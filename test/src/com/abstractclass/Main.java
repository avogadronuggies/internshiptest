package com.abstractclass;
abstract class Teacher{
	public abstract void Details(String name,int id);
}

class Department extends Teacher{
	@Override
	public void Details(String name, int id) {
		// TODO Auto-generated method stub
	System.out.println("Name:"+name+" Id:" +id);	
	}
}
public class Main{
	public static void main(String[] args) {
		Department department= new Department();
		department.Details("Vijet", 10);
		}
}