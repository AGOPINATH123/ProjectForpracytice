package PacakageForPractice.com;

import java.util.Scanner;

public class ProjectK extends Thread{

 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Thread t1=new Thread("GOPI");
		t1.start();
	  do {
		
			   System.out.println("WELCOME TO THE WORLD OF \"GIM\"\n");
			   try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			   
			   System.out.println("ENTER \"E\" FOR ENTERTAINMENT\nENTER \"T\" FOR TOURISM ");
			String opt=sc.next();
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			if(opt.equalsIgnoreCase("E")) {
				System.out.println("TYPE YOUR OPTION\n\nMOVIES          SHOWS          GAMES");
			}
			else if(opt.equalsIgnoreCase("t")) {
				System.out.println("WELCOME TO THE WORLD OF TOURISM");
				
			}
			else {
				System.out.println("YOU HAVE ENTERED WRONG OPTION");
			}
				
			}
			while(sc.hasNext()); {
				
			switch(sc.next().toUpperCase().trim()) {
			case "MOVIES":
				 System.out.println("WLCOME TO THE WORLD OF CINEMAS");
				 
				 
				 
			}}	
				sc.close();
				
				}
				
			}
		
	
