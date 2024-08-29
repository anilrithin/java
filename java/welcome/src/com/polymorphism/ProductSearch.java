package com.polymorphism;

public class ProductSearch {
public void search(int pid)
{
	System.out.println("product search by id:"+pid);
}
public void search(String name)
{
	System.out.println("product search by string name:"+name);
}
public void search(int pid , string name)
{
	 System.out.println("searching products by "+pid" and "+name);
}
}
