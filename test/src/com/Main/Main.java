package com.Main;
import com.Emp.*;
import com.Manger.*;
public class Main {
public static void main(String[] args) {
	Emp emp= new Emp();
	Manager manager = new Manager();
	System.out.println(emp.calSal(1000));
	System.out.println(manager.calSal(10000,100));
}
}
