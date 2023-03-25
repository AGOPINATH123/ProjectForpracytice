package PacakageForPractice.com;

import java.util.Scanner;

public class PojectIdly {
	public static void main(String[] args) {
		boolean isresult;
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"-----------------------------------------------------------------------------------------------------"
						+ "----------------------------------------------------------\n");
		System.out.println("\t\t\t\t\t  HOTEL DWARAKA");
		System.out.println("\t\t\t\t  Near Chandanagar,PJR StadiumLane,");
		System.out.println("\t\t\t\t\t  Hyderabd-500050.");
		System.out.println("\t\t\t\t\t\t\t\t\tPH:040-236521,");
		System.out.println("\t\t\t\t\t\t\t\t\t   9365688788.");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------"
						+ "-----------------------------------------");

		System.out.println("\t\t\t\t\tLIST OF ITEMS AND PRICES");
		System.out.println(
				"SECLECT THE ITEMS\nPress-1.IDLY = 25/-\nPress-2.VADA = 20/-\nPress-3.DOSA = 30/-\nPress-4.MEALS = 110/-");
		// int k=sc.nextInt();
		int idlysum = 0;
		int idlycount = 0;
		int vadacount = 0;
		int vadasum = 0;
		int dosacount = 0;
		int dosasum = 0;
		int mealcount = 0;
		int mealssum = 0;

		// PojectIdly [] BB = new PojectIdly[9];

		while (sc.hasNextInt()) {

			switch (sc.nextInt()) {

			case 1:
				System.out.println("****Idly Plates****");
				int n = sc.nextInt();
				int idly = 25;
				for (int i = 1; i <= n; i++) {
					idlycount++;
					idlysum = idlysum + idly;
				}
				System.out.println(
						"SECLECT THE ITEMS\n1.IDLY = 25/-\n2.VADA = 20/-\n3.DOSA = 30/-\n4.MEALS = 110/-\nE.EXIT");

				break;
			case 2:
				System.out.println("***** VADA PLATES*****");
				int m = sc.nextInt();
				int vada = 20;
				for (int i = 1; i <= m; i++) {
					vadacount++;
					vadasum = vadasum + vada;
				
				System.out.println(
						"SECLECT THE ITEMS\n1.IDLY = 25/-\n2.VADA = 20/-\n3.DOSA = 30/-\n4.MEALS = 110/-\nE.EXIT");
				
				}
				break;
				
			case 3:
				System.out.println("ENTER NO OF PLATES DOSA");
				int o = sc.nextInt();
				int dosa = 30;
				for (int i = 1; i <= o; i++) {
					dosacount++;
					dosasum = dosasum + dosa;
				}
				System.out.println(
						"SECLECT THE ITEMS\n1.IDLY = 25/-\n2.VADA = 20/-\n3.DOSA = 30/-\n4.MEALS = 110/-\nE.EXIT");

				break;
			case 4:
				System.out.println("ENTER NO OF PLATES MEALS");
				int p = sc.nextInt();
				int meals = 110;
				for (int i = 1; i <= p; i++) {
					mealcount++;
					mealssum = mealssum + meals;
				}
				System.out.println(
						"SECLECT THE ITEMS\n1.IDLY = 25/-\n2.VADA = 20/-\n3.DOSA = 30/-\n4.MEALS = 110/-\nE.EXIT");

				break;

			default:
				System.out.println("enter valid input");

			}
		}
		boolean result = false;
		if(result) {
		System.out.println("----------------------------------------------------------------------------------"
				+ "-----------------------------------------------------------------------------------------------");
		if (idlysum != 0) {
			System.out.println("YOU HAVE ORDERED " + idlycount + " PLATES IDLY " + " = " + idlysum);
		}
		if (vadasum != 0) {
			System.out.println("YOU HAVE ORDERED " + vadacount + " PLATES VADA " + " = " + vadasum);
		}
		if (dosasum != 0) {
			System.out.println("YOU HAVE ORDERED " + dosacount + " PLATES DOSA " + " = " + dosasum);
		}
		if (mealssum != 0) {
			System.out.println("YOU HAVE ORDERED " + mealcount + " PLATES MEAL " + " = " + mealssum);
		}

		System.out.print("GRAND TOTAL OF YOUR ORDER IS : ");
		System.out.println((idlysum) + (vadasum) + (dosasum) + (mealssum));
		System.out.println("Enjoy the Food!!");
		System.out.println("----------------------------------------------------------------------------------"
				+ "-----------------------------------------------------------------------------------------------");
		}
		else {
			System.out.println("Better luck next time");
		}
	}
}
