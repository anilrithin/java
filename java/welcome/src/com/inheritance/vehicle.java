package com.inheritance;

class vehicle{
	string model;
    int year;
    string made;
    public vehicle (string model,int year,string made)
    {
    	this.model=model;
    	this.year=year;
    	this.made=made;
    }
public void displayinfo()
{
	System.out.println("vehicle model:"+model);
	System.out.println("vehicle year:"+year);
	System.out.println("vehicle made:"+made);
	
}
class car extends vehicle{
	double doors;
	
}
}

public class Test vehicle {
	public static void main(String[]args) {
		carC= new car("force,2018,tata,four");
	}
	
}

















public class vehicle {

	
	
	
	
	
}
