package PacakageForPractice.com;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialisable implements Serializable{
	
	private static final long serialVersionUID = 1L;

			public static void main(String[] args) {
	        Employee employee = new Employee();
	        employee.setAge(23);
	        employee.setGender("MALE");
	        employee.setName("GOPI");
	        employee.setNumber(9391205065L);
	        try {
	            FileOutputStream fileOut = new FileOutputStream("employee.ser");
	            ObjectOutputStream out = new ObjectOutputStream(fileOut);
	            out.writeObject(employee);
	            out.close();
	            fileOut.close();
	            System.out.printf("Serialized data is saved in employee.ser");
	        } catch (IOException i) {
	            i.printStackTrace();
	        }
	    }
	}
