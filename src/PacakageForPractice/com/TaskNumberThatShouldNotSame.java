package PacakageForPractice.com;

import java.util.Scanner;

class Excep extends Exception {

	private static final long serialVersionUID = 1L;

	Excep(String g) {
		super(g);
	}
}

public class TaskNumberThatShouldNotSame {
	public static void main(String[] args) throws Excep {
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Entyer your mobile number");
			long num = sc.nextLong();
			String s = String.valueOf(num);
			// String s=Long.toString(num);
			String regex = "(0/91)?[789][0-9]{9}";
			if (!s.matches(regex))
			{
				throw new Excep("YOUR NUMBER IS NOT VALID");
			} else 
			{
				System.out.println("THIS IS YOUR PHONE NUMBER " + num);
				System.out.println("THIS IS YOUR PHONE NUMBER IS VALID " + s.matches(regex));
			}
		} 
		catch (Excep g) 
		{
			System.out.printf("Exception occured i;e %s ", g);
		}
	}
}