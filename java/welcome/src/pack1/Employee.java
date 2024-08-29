package pack1;

class Parent{
	public void m2()
	{
		System.out.println("m2 fromparent pack1");
	}
}

public class Employee extends Parent {
	
  public void m1()
  {
	  System.out.println("iam m1 method from pack1");
  }
  public static void main (String[]args) {
	  Employee emp= new Employee();
	  emp.m1();
	 // emp.m2();
	//  Parent p= new Parent();
	//  p.m2();
  }
  
}


