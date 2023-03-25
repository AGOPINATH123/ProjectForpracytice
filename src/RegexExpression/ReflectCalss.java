package RegexExpression;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectCalss {

	public static void main(String[] args) {
		
		try {
			Class<?> c=Class.forName("java.awt.Dimension");
			
			System.out.println("Constructors : ");
			Constructor<?> cons[]=c.getConstructors();
			for(int i=0;i<cons.length;i++) {
				System.out.println(" "+cons[i]);
			}
			System.out.println("Feilds :");
			Field fil[]=c.getFields();
			for(int j=0;j<fil.length;j++) {
				System.out.println(" "+fil[j]);
			}
			System.out.println("Methods :");
			Method me[]=c.getMethods();
			for(int k=0;k<me.length;k++) {
				System.out.println(" "+me[k]);
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
