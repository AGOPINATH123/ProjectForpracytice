package CollectionsPractice;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Passengers2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LinkedList<PassengerList> list = new LinkedList<PassengerList>();
		
		/*System.out.println("Enter The Number of passengers "); 
		  int nt=sc.nextInt();
		  for(int i=1;i<=nt;i++) {
		  System.out.println("Enter your Name Passenger "+i);
		  String nd=sc.next().toUpperCase(); 
		  System.out.println("Enter your Gender  ");
		  String gen=sc.next().toUpperCase();
		  System.out.println("Enter your age Passenger "+i); 
		  int ag=sc.nextInt();
		  System.out.println("Enter Boarding Station"); 
		  String Bd=sc.next().toUpperCase();
		  System.out.println("Enter Destination"); 
		  String de=sc.next().toUpperCase();
		  System.out.println("Enter Aadhar Number Passenger "+i); 
		  long aa=sc.nextLong(); 
		  System.out.println("Enter Mobile Number Passenger "+i);
		  long mb=sc.nextLong(); 
		  System.out.println("Choose your BirthPreference");
		  System.out.println("LB || MB || UB || SL || SU"); String
		  ch=sc.next().toUpperCase(); 
		  if(ch.equalsIgnoreCase("LB") ||
		  ch.equalsIgnoreCase("MB") || ch.equalsIgnoreCase("UB") ||
		  ch.equalsIgnoreCase("SL") || ch.equalsIgnoreCase("SU")) {
		  System.out.println(ch); } 
		  else { System.out.println("valid input"); }
		  
		  list.add(new PassengerList(nd,gen, ag, Bd , de, aa,mb,ch));
		  
		  }*/
		// list.add(new PassengerListnull, null, 0, null, null, 0, 0, null);
		list.add(new PassengerList("gopi nath ", "male", 22, "Lingampally", "warangal", 856946558, 565555555, "UB"));
		list.add(new PassengerList("raju", "male", 32, "secandrabad", "kazipet ", 856946555, 589897995, "LB"));
		list.add(new PassengerList("kalyan", "male", 23, "Lingampally", "vizag   ", 856247655, 895555555, "SU"));

		list.add(1, new PassengerList("abcd", "female", 20, "secandrabad","mumbai" ,569854, 932584560, "SL"));
		
		LinkedList<PassengerList>list1=new LinkedList<PassengerList>();
		list1.add(new PassengerList("mokshi", "female", 1, "lingampaally", "vizag", 895666556, 365265556, "UB"));
		
		list.addAll(list1);
		//list.addAll(1, list1);
		//list.addFirst(new PassengerList(null, null, 0, null, null, 0, 0, null))
		//list.addLast(new PassengerList(null, null, 0, null, null, 0, 0, null))
		//list.contains(list1);
		//list.containsAll(list1);
		//list.get(2);
		//list.getFirst();
		//list.getLast();
		//list.indexOf(new PassengerList(null, null, 0, null, null, 0, 0, null));
		//list.isEmpty();
		
		Comparator<PassengerList> sd1=new Comparator<PassengerList>() {

			@Override
			public int compare(PassengerList p1, PassengerList p2) {
				if(p1.Age<p2.Age) {
					return -1;
				}
				else {
					return 1;
				}
			}
			
		};
		
		/*Comparator<PassengerList> ss = new Comparator<PassengerList>() {
			@Override
			public int compare(PassengerList p1, PassengerList p2) {
				if (p1.Name.length() < p2.Name.length()) {
					return -1;

				} else {
					return 1;
				}
			}

		};*/
		
        
		Stream<PassengerList> sd = list.stream().filter(p -> p.Age > 23);
		sd.forEach(det -> System.out.println(det));
		
		
		/*
		 * Iterator itr1=list.iterator();
		 * while(itr1.hasNext()) {
		 * System.out.println(itr1.next());
		 * 
		 * }
		 */
		
	Collections.sort(list, sd1);
		list.forEach(sdgr -> System.out.println(sdgr));
		System.out.println("-------------------------------------");
		System.out.println("Collections.asLifoQueue"+Collections.asLifoQueue(list)); 
	    System.out.println("Collections.asLifoQueue"+Collections.asLifoQueue(list1)); 
		
		
	}
}
