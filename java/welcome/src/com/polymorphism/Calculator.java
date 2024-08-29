package com.polymorphism;

public class Calculator {
public void addition(int a,int b,int c)
{
	System.out.println("addition of three int params are:"+(a+b+c));
}
public void addition (int a,int b)
{
	System.out.println("addition of two int values:"+(a+b));
	
}
public void addition(float a, float b) {
	System.out.println("addition of two float values:"+(a+b));
	
}
public void addition(int a, float b) {
	System.out.println("addition of int and float values:"+(a+b));
}
}
