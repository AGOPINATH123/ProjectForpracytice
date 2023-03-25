package Exceptionex1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

	public class Serialization123 implements Serializable{	
	private static final long serialVersionUID = 1L;
	int id;
	double salary;
	String name;	
	public static void Serialization() throws Exception {
		Serialization123 s = new Serialization123();
		s.id = 10;
		s.salary = 250000;
		s.name = "abc";
		
	//	File f = new File("file.txt");
	//	FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("file.txt")));
		oos.writeObject(s);
		System.out.println("serialization is done");
	}
	
	
	public static void Deserialization() throws Exception {
		
		FileInputStream fis = new FileInputStream("file.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		Serialization123 s = (Serialization123)o;
		System.out.println(s.id);
		
	}
	

	

}
