package com.polymorphism;
class parent{
	int age=77;
	public void getAge(int age) {
		this.age=++age;
		System.out.println("my parent age is:"+this.age);
		}
}
public class ThisFinal extends ParentFinal {
	public void getAge(int age) {
		this.age=--age;
		System.out.println("my  age is:"+this.age);
		}
public static void main(String[] args) {
	
}
}
