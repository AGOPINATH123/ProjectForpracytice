package PacakageForPractice.com;

import java.util.Scanner;

public class SmallProject {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Details:");
		System.out.println("Student id");
		int stdid=sc.nextInt();
		System.out.println("Student Name");
		String name=sc.next();
		System.out.println("Gender");
		String Gender=sc.next();
		System.out.println("Department id");
		int dptid=sc.nextInt();
		
		System.out.println("Phone Number");
		long pn=sc.nextInt();
		System.out.println("Hostel Name");
		String Hstlname=sc.next();
		System.out.println("Room No");
		int rn=sc.nextInt();
		
		System.out.println("Modify Room No(Y/N)?");
		boolean s=sc.next().equals("Y");
		System.out.println("New Room Number");
			int rn1=sc.nextInt();
			rn=rn1;
		
		System.out.println("Modify Phone No(Y/N)?");
		boolean s1=sc.next().equals("Y");
		System.out.println("New Phone Number");
		   long pn1=sc.nextInt();
			pn=pn1;
		
		
		System.out.println("Student id "+stdid);
		System.out.println("Student Name "+name);
		System.out.println("Department id "+dptid);
		System.out.println("Gender "+Gender);
		System.out.println("Phone Number "+pn);
		System.out.println("Hostel Name "+Hstlname);
		System.out.println("Room No "+rn);
		
	}

}
