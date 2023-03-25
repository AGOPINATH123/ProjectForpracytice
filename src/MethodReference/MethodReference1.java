package MethodReference;
import java.util.function.BiFunction;
interface Student{
	public void say();	
}
class Aruthmetic{
	public static int add(int a,int b) { //SOLVED USING BIFUNCTION
		return a+b;
	}
	public static float add(int a,float b) { //SOLVED USING BIFUNCTION
return a*b;
}
	public static double add(double a,double b) { 
		return a*b;
	}
}
public class MethodReference1 {//SOLVED USING INTERFACE CALLING
	
	public static void Saying() {
		System.out.println("say calling");
	}
	public static void SaySomething() {
		System.out.println("Say something");
	}
	 class MethodReference2 { //SOLVED USING THREAD
		public static void ThreadStatus() {
			System.out.println("Thread is running.........");
		}
	 }
	public static void main(String[] args) {		
		System.out.println(Aruthmetic.add(2.25,369));
		System.out.println(Aruthmetic.add(25, 236.5));
		System.out.println(Aruthmetic.add(3, 25));		
		BiFunction <Integer,Integer,Integer>addIn=Aruthmetic::add;//BIFUNCTION
		BiFunction <Integer,Float,Float>addIn1=Aruthmetic::add;//BIFUNCTION
		BiFunction <Double,Double,Double>addIn2=Aruthmetic::add;//BIFUNCTION

		int result=addIn.apply(10, 20);
		float result1=addIn1.apply(200,20.220f);
		double result2=addIn2.apply(2.000, 300.562553);
				System.out.println(result);
				System.out.println(result1);
				System.out.println(result2);

		Student s1=MethodReference1::SaySomething; //INTERFACE
		
		s1.say();
		
	
		Thread t1 =new Thread(  //THREAD
				MethodReference2::	ThreadStatus);
		t1.start();
	}}
