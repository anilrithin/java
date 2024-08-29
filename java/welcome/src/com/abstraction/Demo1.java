package com.abstraction;

interface DemoInterf{
	final int age=90;
	public abstract void m1();
	abstract void m2();
	void m3();
}

public class Demo1 implements DemoInterf {
public void m1() {
	System.out.println("iam m1 method");
}
public void m2() {
	System.out.println("iam m2 method");
}
public void m3() {
	System.out.println("iam m3 method");
}
public static void main(String[] args) {
	Demo1 D=new Demo1();
	Demo.m1();
	

		
}
}