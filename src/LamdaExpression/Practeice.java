package LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

class Student{
	int id;
	String name;
	String gender;
	public  Student (int id,String name,String gender) {
		 super();
		this.id=id;
		this.name=name;
		this.gender=gender;
	}}
public class Practeice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Student> list=new ArrayList<Student>();
		for(int i=1;i<=5;i++) {
			System.out.println(i+"."+"ENTER STUDENT ID");
			int n=sc.nextInt();
			System.out.println(i+"."+"ENTER STUDENT NAME");
			String g=sc.next();
			System.out.println(i+"."+"ENTER STUDENT GENDER");
			String g1=sc.next();

		    list.add(new Student(n, g,g1));
		}
		list.add(new Student(102,"PADMA    ","FEMALE"));
		list.add(new Student(103,"ESHWAR   ","MALE"));
		list.add(new Student(104,"MOKSHITHA","FEMALE"));
		
		Collections.sort(list,( p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		for(Student s:list) {
			System.out.println(s.id+" "+s.name+"\t"+s.gender);
		}
		
	 Stream<Student>filtered_data=list.stream().filter(
			 p->p.id>103
			// p->p.name.startsWith("g")
);
	 
	 filtered_data.forEach(Student->
	 System.out.println("FILTERED DATA\n"+Student.id+" "+Student.name));
	}}
