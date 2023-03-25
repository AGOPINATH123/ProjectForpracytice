package Exceptionex1;

public class CustomEx1 {

	static void Validate(int age) throws Exception12 {

		if (age < 18) {
			throw new Exception12("Age is not valid");
		} else {
			System.out.println("Age is eligible for voting");
		}
	}

	public static void main(String[] args) {

		try {
			Validate(18);
		} catch (Exception12 g) {
			System.out.println("Exception" + g);
		}
	}

}
