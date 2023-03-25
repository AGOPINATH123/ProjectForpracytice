package PacakageForPractice.com;

import java.util.Scanner;

class InvalidAge extends Exception{
	public InvalidAge(String string) {
		System.out.println("your age is not enough");
	}

}
public class ExceptionCustom {
	
	
	public static void main(String[] args) throws InvalidAge,ArithmeticException 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter age");
		int age= sc.nextInt();
		
		if (age<22) {
			throw new InvalidAge("in valid age");
		}
		else {
			System.out.println("good to go");
		}
		
	}

}
