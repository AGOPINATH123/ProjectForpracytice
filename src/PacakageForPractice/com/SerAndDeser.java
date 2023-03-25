package PacakageForPractice.com;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerAndDeser implements Serializable{
	private static final long serialVersionUID = 1L;
	String name;
	int age;
	SerAndDeser(String name ,int age) {
		this .name =name;
		this.age=age;
	}
public static void main(String[] args) throws Exception {
		SerAndDeser gg=new SerAndDeser("gopi",23);
		
		FileOutputStream fileout=new FileOutputStream("ser.set");
		ObjectOutputStream out=new ObjectOutputStream(fileout);
		out.writeObject(gg);
		out.close();
		fileout.close();
		System.out.println("srialization process completed");
		
		//Deserialization;
		SerAndDeser ft=null;
		FileInputStream filein=new FileInputStream("ser.set");
		ObjectInputStream in=new ObjectInputStream(filein);
		ft = (SerAndDeser)in.readObject();
		in.close();
		filein.close();
		System.out.println("desirialization process completed ");
		System.out.println("name "+ft.name);
		System.out.println("age "+ft.age);
		
		

	}

}
