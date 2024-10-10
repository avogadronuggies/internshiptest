package com.interfaceclass;
interface Person{
	public static final String name ="Vijet";
	public static final int age=21;
	public abstract void Details(String name , int id);
}
class Home implements Person{
	@Override
	public void Details(String name, int id) {
		// TODO Auto-generated method stub
	System.out.println(name +" "+id);	
	}
}
public class Main{
	public static void main(String[] args) {
		Home home= new Home();
		home.Details("Vijet", 21);
		
	}

}
