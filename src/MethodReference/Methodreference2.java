package MethodReference;

import java.util.function.BiFunction;

interface Syaing1{
	void say();
}
class Methodreference{
	public static int addi(int a ,int b) {
		int c=a+b;
		System.out.println("hello boss this is sum"+c);
		return c;
	}}

public class Methodreference2 {
	
	public void Method() {
		System.out.println("say hello to BOSS");
		
	}
	public void add2() {
		System.out.println("hello boss how are you"); //THRAED CALLED
	}
	public static int addii(int a ,int b) {//BIFUNCTION CALLED
		int c=a+b;
		System.out.println("inside main class hello boss this is sum"+c);
		return c;
}
	public static void main(String[] args) {
		Methodreference2 GG=new Methodreference2();
		BiFunction<Integer,Integer,Integer> data=Methodreference2::addii;//TO CALL BIFUCTION THE THE METHOD SHOULD STAATIC;
		int result=data.apply(20,300);
		System.out.println(result);
		
		Syaing1 sayy=GG::Method;
		sayy.say();
		
		Thread t1=new Thread(
			new Methodreference2()::add2);//PARAMETERED DATA  CANT BE RUNNED USOING THREAD;
		
		t1.start();
	}
	

}
