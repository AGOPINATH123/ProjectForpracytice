package PacakageForPractice.com;

import java.util.Scanner;

public class BillingTask1 {
	    // variable to calculate electricity bill to pay  
	    static double billToPay;  
	       
	    static double GetBill(long units)  
	    {  
	        // check whether units are less than 100  
	        if(units < 100)  
	        {  
	            billToPay = units*1.20; 
	        }  
	        // check whether the units are less than 300  
	        else if(units < 300){  
	            billToPay = 100*1.20+(units - 100)*2;  
	        }  
	        // check whether the units are greater than 300  
	        else if(units > 300)  
	        {  
	            billToPay = 100*1.20+200*2+(units - 300)*3;  
	            
	        }  
	        return billToPay;  
	    }  }    
