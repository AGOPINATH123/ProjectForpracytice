package PacakageForPractice.com;

import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {

	public static void main(String[] args) throws IOException {

		FileWriter fout=new FileWriter("FOUR.txt");
		fout.write("GOPI IS GOOD BOY AND WRITING A POEM FOR HIS DAUGHTER ,TO MAKE, HIS DAUGHTER HAPPY .");
		System.out.println("FILE WRITED SUCCESSFULLY\n");
fout.close();
System.out.println("THE OUT PUT OF THE FILE IS ");

Scanner sc=new Scanner(new File("FOUR.txt"));

	String line=sc.nextLine();
	System.out.println(line);
	
	sc.close();
	
	}
}
