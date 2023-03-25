package Revisingnew;

import java.util.Scanner;

public class ArmStrongNumber {
	static boolean isArmStrong;
	static int num;
	public static boolean Method() {
		int s1 = String.valueOf(num).length();
		int temp = num;
		int rem;
		int Sum = 0;
		while (temp != 0) {
			rem = temp % 10;
			Sum = (int) (Sum + (Math.pow(rem, s1)));
			temp /= 10;
		}
		if (Sum == num) {
			return isArmStrong =true;
		} else {
			return false ;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");		
			num = sc.nextInt();			
			Method();	
			
			if (isArmStrong==true) {
				System.out.println("number is ArmStrong");
				

			} else {
				System.out.println("number is NotArmStrong");
						
			
		}
			
		
		
		
	}}
