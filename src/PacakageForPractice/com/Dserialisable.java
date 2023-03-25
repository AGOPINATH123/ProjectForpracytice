package PacakageForPractice.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Dserialisable implements Serializable{

 /**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

/**
 * @throws ClassNotFoundException 
	 * 
	 */
	//private static final long serialVersionUID = 0;
            public static void main(String[] args) throws IOException, ClassNotFoundException  {
	        Employee employee = null;
	      
	            FileInputStream fileIn = new FileInputStream("employee.ser");
	            ObjectInputStream in = new ObjectInputStream(fileIn);
	            employee  = (Employee) in.readObject();
	            in.close();
	            fileIn.close();
	      
	        
	        System.out.println("Deserialized Employee...");
	        System.out.println("Name: " + employee.getName());
	        System.out.println("age: " + employee.getAge());
	        System.out.println("number: " + employee.getNumber());
	        System.out.println("gender: " + employee.getGender());
	    }
	
}

