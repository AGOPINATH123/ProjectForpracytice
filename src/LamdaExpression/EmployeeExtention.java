package LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class EmployeeExtention {

		public static void main(String[] args) {

		List<Employee> list=new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NO OF EMPLOYEES YOU WANT TO STORE DATA");
		int a=sc.nextInt();
		for (int i=1;i<=a;i++) {
			System.out.println(i+"."+"ENTER EMPLOYE ID");
			int id=sc.nextInt();
			System.out.println(i+"."+"ENTER EMPLOYE NAME");
			String nn=sc.next();
			System.out.println(i+"."+"ENTER EMPLOYE AGE");
			int i1=sc.nextInt();
			System.out.println(i+"."+"ENTER EMPLOYE SALARY");
            double ss=sc.nextDouble();
			
			
			list.add(new Employee(id, nn, i1, ss));

		}
		Iterator itr=list.iterator();
		
		list.forEach(EmployyeeResul->System.out.println(EmployyeeResul));
		
		
		Collections.sort(list,(p1,p2)->{
		return p1.getName().compareTo(p2.getName());
		});
		Stream<Employee> filterd_data=list.stream().filter(p->p.getAge()>20);
		Stream<Employee>filterd_data1=list.stream().filter(p->p.getName().startsWith("g"));
		
		filterd_data.forEach(filter->System.out.println(filter));
		filterd_data1.forEach(filterLetter->System.out.println(filterLetter));
		
	}

}
 





