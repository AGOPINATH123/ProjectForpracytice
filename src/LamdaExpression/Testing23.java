package LamdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testing23 {
	String Name;
	int Age;
	long Aadar;
	String from;
	String dest;

	public Testing23(String name, int age, long aadar, String from, String dest) {
		super();
		this.Name = name;
		this.Age = age;
		this.Aadar = aadar;
		this.from = from;
		this.dest = dest;
	}
	@Override
	public String toString() {
		return "Name=" + Name + ", Age=" + Age + ", Aadar=" + Aadar + ", from=" + from + ", dest=" + dest+"";
	}
	public static void main(String[] args) {		
         
		List<Testing23>lip=new ArrayList<>();
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("\t\t\t  **WELCOME TO IRCTC**                ");
			System.out.println("\t\t\t          *****                       ");
			System.out.println("NO OF PASSENGERS? ");
			int nm=sc.nextInt();
			for(int i=1;i<=nm;i++) {
				
				System.out.println("PLEASE ENTER YOUR DETAILS");
				System.out.println("ENTER YOUR NAME");
				String nma = sc.next();
				System.out.println("ENTER YOUR AGE");
				int dfg = sc.nextInt();
				System.out.println("ENTER YOUR AADHAR");
				long s1 = sc.nextLong();
				System.out.println("ENTER THE BOARDING STATION");
				String g = sc.next();
				System.out.println("ENTER THE DESTINATION");
				String h = sc.next();
				lip.add(new Testing23(nma, dfg, s1, g, h));
			}
			
			
			System.out.println("PLEASE SELECT THE OPTION");
			System.out.println("\t1.FLIGHT \n\t2.TRAIN  \n\t3.BUS ");		

			while (sc.hasNextInt()) {
				switch (sc.nextInt()) {
				case 1:				
					System.out.println("WELCOME TO IRCTC FLIGHT BOOKING");
					System.out.println("-----------********-------------");
					System.out.println("SELECT THE FLIGHT");
					System.out.println("TYPE.*AIRLINE*\nTYPE.*INDIGO*\nTYPE.*AIRASIA*");
					String sd12 = sc.next();
					if (sd12.trim().equalsIgnoreCase("AIRLINE")) {
						System.out.println("***************************************************************");
						System.out.println("HERE YOUR DETAILS :");
						System.out.println(lip);
						System.out.println("***************************************************************");

						System.out.println("YOUR TOTAL FARE AIRLINE :-");
						System.out.println("TICKET PRIICE  = 2500/-"+"*"+nm+" "+(2500*nm));
						System.out.println("          GST  = "+(2500*nm+2500*nm/100));
						System.out.println("BOOKING CHARGE = "+(250));
						System.out.println("YOUR TOTAL COST= 3000/- "+(2500*nm+2500*nm/100+250));
						System.out.println("ENJOY THE TRIP");

						System.out.println("***************************************************************");
						System.out.println("***************************************************************");
						System.out.println("PLEASE SELECT THE OPTION");

						System.out.println("\t1.FLIGHT \n\t2.TRAIN  \n\t3.BUS  \n\t4.CANCEL");


					} else if (sd12.trim().equalsIgnoreCase("INDIGO")) {

						System.out.println("***************************************************************");
						System.out.println("HERE YOUR DETAILS :");
						System.out.println(lip);
						System.out.println("***************************************************************");


						System.out.println("YOUR TOTAL FARE INDIGO :-");
						System.out.println("TICKET PRIICE  = 2700/-");
						System.out.println("          GST  = 10%   ");
						System.out.println("BOOKING CHARGE = 250/-");
						System.out.println("YOUR TOTAL COST= 3200/- ");
						System.out.println("ENJOY THE TRIP");

						System.out.println("***************************************************************");
						System.out.println("***************************************************************");
						System.out.println("PLEASE SELECT THE OPTION");

						System.out.println("\t1.FLIGHT \n\t2.TRAIN  \n\t3.BUS  \n\t4.CANCEL");

					} else if (sd12.trim().equalsIgnoreCase("AIRASIA")) {
						System.out.println("***************************************************************");
						System.out.println("HERE YOUR DETAILS :");
						System.out.println(lip);
						System.out.println("***************************************************************");
						System.out.println("YOUR TOTAL FARE AIRASIA :-");
						System.out.println("TICKET PRIICE  = 2600/-");
						System.out.println("          GST  = 10%   ");
						System.out.println("BOOKING CHARGE = 250/-");
						System.out.println("YOUR TOTAL COST= 3100/- ");
						System.out.println("ENJOY THE TRIP");
						System.out.println("***************************************************************");
						System.out.println("***************************************************************");
						System.out.println("PLEASE SELECT THE OPTION");

						System.out.println("\t1.FLIGHT \n\t2.TRAIN  \n\t3.BUS  \n\t4.CANCEL");}
					else {
						System.out.println("ENTER A VALID INPUT");
					}
					break;

						case 2:
				
							System.out.println("WELCOME TO IRCTC TRAIN BOOKING");
							System.out.println("-----------********-------------");
						/*	System.out.println("PLEASE ENTER YOUR DETAILS");
							System.out.println("ENTER YOUR NAME");
							String na = sc.next();
							System.out.println("ENTER YOUR AGE");
							int dg = sc.nextInt();
							System.out.println("ENTER YOUR AADHAR");
							long s122 = sc.nextLong();
							System.out.println("ENTER THE BOARDING STATION");
							String g1 = sc.next();
							System.out.println("ENTER THE DESTINATION");
							String h1 = sc.next();*/
							System.out.println("SELECT THE TRAIN");
							System.out.println("TYPE.*VISAKAEXPRESS*\nTYPE.*GARIBRATH*\nTYPE.*NEWDELHI*");
							String sd121 = sc.next();
							if (sd121.trim().equalsIgnoreCase("VISAKAEXPRESS")) {
								System.out.println("***************************************************************");
								System.out.println("HERE YOUR DETAILS :");
								System.out.println(lip);
								System.out.println("***************************************************************");

								System.out.println("YOUR TOTAL FARE VISAKAEXPRESS :-");
								System.out.println("TICKET PRIICE  = 1200/-");
								System.out.println("          GST  = 10%   ");
								System.out.println("BOOKING CHARGE = 180/-");
								System.out.println("YOUR TOTAL COST= 1500/- ");
								System.out.println("ENJOY THE JOURNEY");

								System.out.println("***************************************************************");
								System.out.println("***************************************************************");
								System.out.println("PLEASE SELECT THE OPTION");

								System.out.println("\t1.FLIGHT \n\t2.TRAIN  \n\t3.BUS  \n\t4.CANCEL");


							} else if (sd121.trim().equalsIgnoreCase("GARIBRATH")) {

								System.out.println("***************************************************************");
								System.out.println("HERE YOUR DETAILS :");
								System.out.println(lip);
								System.out.println("***************************************************************");


								System.out.println("YOUR TOTAL FARE GARIBRATH :-");
								System.out.println("TICKET PRIICE  = 700/-");
								System.out.println("          GST  = 10%   ");
								System.out.println("BOOKING CHARGE = 30/-");
								System.out.println("YOUR TOTAL COST= 800/- ");
								System.out.println("ENJOY THE JOURNEY");

								System.out.println("***************************************************************");
								System.out.println("***************************************************************");
								System.out.println("PLEASE SELECT THE OPTION");

								System.out.println("\t1.FLIGHT \n\t2.TRAIN  \n\t3.BUS  \n\t4.CANCEL");

							} else if (sd121.trim().equalsIgnoreCase("NEWDELHI")) {
								System.out.println("***************************************************************");
								System.out.println("HERE YOUR DETAILS :");
								System.out.println(lip);
								System.out.println("***************************************************************");
								System.out.println("YOUR TOTAL FARE NEWDELHI :-");
								System.out.println("TICKET PRIICE  = 1600/-");
								System.out.println("          GST  = 10%   ");
								System.out.println("BOOKING CHARGE = 140/-");
								System.out.println("YOUR TOTAL COST= 1900/- ");
								System.out.println("ENJOY THE TRIP");
								System.out.println("***************************************************************");
								System.out.println("***************************************************************");
								System.out.println("PLEASE SELECT THE OPTION");

								System.out.println("\t1.FLIGHT \n\t2.TRAIN  \n\t3.BUS  \n\t4.CANCEL");
						
							}
							else {
								System.out.println("ENTER A VALID INPUT");
							}
							break;
						
						case 4:
				            System.out.println("YOU HAVE CANCELLED BOOKING SUCCESFULLY");

				}
				System.out.println("ENTER *Q* TO QUIT");
				
			}
			sc.close();
		}

	}
}
