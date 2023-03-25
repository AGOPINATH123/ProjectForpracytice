package PacakageForPractice.com;

import java.util.Scanner;
//create class ElectricityBillExample4 to calculate electricity bill using Inheritance  
		public class BillingTask2 extends BillingTask1{
			// main() method start  
	    public static void main(String args[])   
	    {     
	        int units;  
	        Scanner sc = new Scanner(System.in);  
	        System.out.println("Enter number of units for calculating electricity bill.");  
	        units = sc.nextInt();  
	        System.out.println("The electricity bill for "+units+" is:"+GetBill(units) );	        
	        
	    } }  
	
	  