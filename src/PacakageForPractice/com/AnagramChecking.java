package PacakageForPractice.com;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENETR STRING 1");
		String s1=sc.next().toUpperCase();
		System.out.println("ENETR STRING 2");
		String s2=sc.next().toUpperCase();
if(s1.length()==s2.length()) {
	
	char []ff=s1.toCharArray();
	char []ff1=s2.toCharArray();
	
	Arrays.sort(ff);
	Arrays.sort(ff1);
	
	
	boolean result=Arrays.equals(ff, ff1);
	
	if(result) {
		System.out.println("the string "+s1+" and "+s2+" are anagrams");
	}
	else {
		System.out.println("the string "+s1+" and "+s2+" are not anagrams");

	}
	
}
else {
	System.out.println("the string "+s1+" and "+s2+" are not anagrams");

}
	}

	
}
