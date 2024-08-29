package com.polymorphism;

public class Parents {
public void property() {
	System.out.println("1000 crore property");
}
public void marriage() {
	System.out.println("we trying to do arrange marriage");
}

}
public class anil extends Parents{
	@Override
	public void marriage () {
		System.out.println("no no iam already in love");
	}
}