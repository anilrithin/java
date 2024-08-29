package com.inheritance;
class SuperDemo{
	int salary=50000;
	public void getsalary(int salary)
	{
		salary=60000;
		System.out.println("my parent salary is :"+salary);
	}
}
public class Thisdemo {
public class ThisDemo extends SuperDemo {
	int salary=40000;
	public void getsalary (int salary)
	{
		salary=30000;
		System.out.println("my salary is:"+salary);
		System.out.println("my global salary is:"+ this.salary);
	}
	public class Thiscon extends Supercon{}
	int a=20;
	public Thiscon() {
		this(12);
		System.out.println("iam default constructor");
		
	}
	public Thiscon(int age) {
		this.m1();
		System.out.println("iam param constructor");
		}
		
	
}
}
