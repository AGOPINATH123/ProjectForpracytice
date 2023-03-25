package PacakageForPractice.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanning {

	public static void main(String[] args) {

		try {
		Scanner fileScanner=new Scanner(new File("FOUR.txt"));
		while(fileScanner.hasNextLine()) {
			String line=fileScanner.nextLine();
			System.out.println(line);
		}
		fileScanner.close();
		}catch(FileNotFoundException e) {
			System.out.println("file  not found");
		}
		
	}

}
