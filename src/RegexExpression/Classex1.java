package RegexExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Classex1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
		Pattern p=Pattern.compile("(0/91)?[7-9][0-9]{9}");
		System.out.println("enter the mobile number");
		String mn = sc.next();
		Matcher m = p.matcher(mn);
		if (m.find() & m.group().equals(mn)) {
			System.out.println("valid mobile number");

		} else {
			System.out.println("not a valid mobile number");

		}}

	}

}
