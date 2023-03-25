package PacakageForPractice.com;

public class OuterClass {
	int a ;
public void function(int a) {
	this.a=a+3;
	System.out.println("THIS IS A OUTERCLASS");
	
}
public class InnerClass{
	public void fuction1() {
		System.out.println("THIS IS INNER CLASS");
	}
	
}
	public static void main(String[] args) {
		OuterClass obj=new OuterClass();
		obj.function(25);
		OuterClass.InnerClass obj1=obj.new InnerClass();
        System.out.println(obj.a);
        obj1.fuction1();
	}}
