package Revisingnew;

import java.util.Scanner;

public class Factorial {
	static int fact=1;
	static int no;
	public void Fact(int no) {
		if(no>=1) {
		fact=fact*no;
		Fact(no-1);
	}}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Factorial gh=new Factorial();
		System.out.println("Enter the number ");
		gh.no=sc.nextInt();
		gh.Fact(no);
		System.out.println("factorial of "+no+" is "+fact);
		 int gop=1;
		for(int i=1;i<=no;i++) {
			 gop=gop*i;			
		}
		System.out.println("factorial using for loop "+gop);

	}

}
