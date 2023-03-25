package Revisingnew;

public class EncapsulationEx {
	private int age;
	private String name;
	private double salary;
	private String password;
	
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) {
		EncapsulationEx nam = new EncapsulationEx();
		nam.name="gopi";
		nam.age=21;
		nam.password="gopikkdd";
		nam.salary=2530000.322;
		System.out.println(nam.name+">> "+nam.age+">> "+nam.password+" >>"+nam.salary);
	}

	

	
}
