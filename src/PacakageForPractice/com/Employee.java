package PacakageForPractice.com;

public class Employee extends Serialisable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6201946007830162902L;

	//private static final long serialVersionUId =2L;
	
	private String name;
	private int age;
	 private String gender;
	   private long number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		  this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	

	
}
