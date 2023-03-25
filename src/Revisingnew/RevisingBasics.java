package Revisingnew;

import java.util.Scanner;

public class RevisingBasics {
	static String name;
	static int age;
	static String gender;
	RevisingBasics(String name,int age,String gender){
		
		this.name=name;
		this.age =age;
		this.gender=gender;		
	}
	public String toString() {
		return "{ "+name+" }"+"{ "+age+" }"+"{ "+gender+" }";
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		// Wrapper Class
		@SuppressWarnings("removal")
		Integer sd = new Integer(666);
		int u = sd;
		System.out.println(u);

		int s = 65665;
		@SuppressWarnings("removal")
		Integer ss = new Integer(s);
		System.out.println(ss);
		RevisingBasics  rs=  new RevisingBasics(name, age, gender);
		name=sc.next();
		age=sc.nextInt();
		gender=sc.next();
		System.out.printf("your name %s ",name);;
		System.out.printf("your age %d ",age);;
		System.out.printf("your gender %s ",gender);;
		
				}

}
