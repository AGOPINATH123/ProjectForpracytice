package MethodReference;
 interface Done{
	 static void draw() {
		 System.out.println("do it now");
	 }
	 void press();
 }
 interface Sayable extends Done{
	 void sayy(String msg);
	 int hashCode();
	 String toString();
	}
public class FunctionalInterface implements Sayable{
	@Override
	public void sayy(String msg) {
System.out.println(msg);		
	}
	@Override
	public void press() {
System.out.println("hello");		
	}

	public static void main(String[] args) {
		FunctionalInterface hi=new FunctionalInterface();
		Done.draw();
		hi.sayy(" guys");
		hi.press();
		hi.hashCode();
		hi.toString();
	}

	
	

}
