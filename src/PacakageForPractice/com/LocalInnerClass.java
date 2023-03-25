package PacakageForPractice.com;

public class LocalInnerClass {

	

	public void Method() {
	 	class Test{
			private int a,b; 
			public void InnerMethod() {
				
				System.out.println("the sum of a+b :"+(a+b));
				System.out.println("THANK YOU");
				
			}
		
		}
		Test obj1=new Test();
			obj1.a=22;
			obj1.b=33;
			obj1.InnerMethod();
	}

	public static void main(String[] args) {
		
		LocalInnerClass obj=new LocalInnerClass();
        obj.Method();		
	}

}
