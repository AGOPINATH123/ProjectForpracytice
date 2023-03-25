package CollectionsPractice2Online;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeanInCollections implements Serializable {

	private static final long serialVersionUID = 1L;
	private int age;
	private String name;

	public static void Add(List<Integer> li, String many) {
		System.out.println("******hello " + many + "*******");

		int result = li.stream().mapToInt(Integer::intValue).sum();
		System.out.println("HELLO HERE IS YOUR RESULT : " + result);
	}

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(120);
		li.add(111);
		li.add(125);
		li.add(145);
		li.add(62);
		li.add(626);
		li.add(54);
		li.add(1);

		List<Object> ki = new ArrayList<>(li);
		ki.add(100);
		ki.add(101);
		ki.add(254);
		ki.add(45);
		ki.add(25);
		ki.add(23);
		List<Object> ki1 = ki;
		ki1.add("hi");
		ki1.add("hi1");
		ki1.add("hi2");
		System.out.println(ki1);
		System.out.println("index 12 is= " + ki1.get(12));
		ki1.remove(12);

		System.out.println(ki1.set(12, 256));
		System.out.println("index 12 is= " + ki1.get(12));

		Scanner sc = new Scanner(System.in);
		BeanInCollections.Add(li, "GUYS");
		BeanInCollections KL = new BeanInCollections();
		KL.name = sc.next();
		KL.age = sc.nextInt();
		System.out.println(KL);
		System.out.println(KL.name);
		System.out.println(KL.age);

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
