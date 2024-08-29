package com.abstraction;

abstract class TestAbstract{
	public static void m1() {
		System.out.println("iam m1 method");
	}
	protected abstract void sleep();
	public TestAbstract() {
		System.out.println("iam abstarct class constructor");
	}
}
public class Demo extends TestAbstract{
	public void sleep() {
		System.out.println("iam sleeping");
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.m1();
		d.sleep();
	}
}











