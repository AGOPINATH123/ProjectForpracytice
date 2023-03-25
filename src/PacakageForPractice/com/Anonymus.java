package PacakageForPractice.com;

import java.util.Date;

interface BBc{
	public void Function1();
	public void Ruca1(String a);
}
public class Anonymus {	
	public void Ruca1(String a) {
		System.out.println("Hello boss this output from Ruca1 method calling from the interface\n"+a);
	}	
	public void Function1() {
		//System.out.println("Hello boss This is anonymous class object output\n");
	}
	public static void main(String[] args) {
		Date dt=new Date();
		System.out.println(dt.toString());
		System.out.println(dt.getDate());
		//INTERFACE OBJECT CREATED AND CALLED METHODS INSIDE IT
		BBc a1=new BBc()
				{ 
			public void Function1() {
				System.out.println("Abc object----------------------------------------------------\n");
			System.out.println("Hello boss This out put is from Function interface");
				}

			@Override
			public void Ruca1(String a) {
				System.out.println("This output is from Ruc Interface\n "+a);	
				System.out.println("Abc object----------------------------------------------------\n");
	}
				};
				a1.Function1();
				a1.Ruca1("hi");
				
				//OBJECT CALLING METHODS;
		Anonymus obj=new Anonymus() {
			public void Function1() {
				System.out.println("Hello boss This is anonymous class object output\n");
			}
		};
	     obj.Function1();
		obj.Ruca1("hi");
		
		//RUNNABLE INTERFACE ANONYMOUS CLASS
		Runnable re=new Runnable() {
			public void run() {
				System.out.println("Hello boss This is runnable anonymous\n");
			}
		};
		
		re.run();		
	}
	}