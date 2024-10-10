package com.test;

class Emp{
	String name;
	int id;
	int sal;
	String add;
	public Emp(String name, int id, int sal, String add) {
		
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", add=" + add + "]";
	}
	public void  Display(String name, int id, int sal, String add) {
		System.out.println("Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", add=" + add + "]");
	}
}

public class Main {
public static void main(String[] args) {
		Emp emp = new Emp("vijet", 10, 2000, "Mumbai");
		System.out.println(emp.toString());
		emp.Display("Alex", 20, 30000, "jaipur");
}


}
