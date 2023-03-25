package PacakageForPractice.com;

import java.util.Random;

public class RandomNumbers {
public static void main(String[] args) {
	
	Random ran=new Random();
	for(int i=0;i<=1;i++) {
		int g=ran.nextInt(40);
		System.out.println(g);

	}
	
}
}
