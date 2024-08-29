package pack1;
class parent{
	private void m2() {
		System.out.println("iam m2 method");
	}
}
public class employe extends parent {
	
   public void m1() {
	   System.out.println("iam m1 method");
   }
   public static void main(String[] args) {
	employe e= new employe();
	e.m1();
	e.m2();
		
	}
			
}


