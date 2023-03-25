package Exceptionex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testex1211 {

	public static void main(String[] args) {
		Pattern  p=Pattern.compile("e.+?d");
		Matcher m=p.matcher(" end extend cip end eanend extrad");
		int count=0;
		while(m.find()) {
			System.out.println(m.start()+"****\t   "+m.end()+"\t*****"+m.group());
			count++;
		}
		System.out.println(count);
		String str="mine is meant mivuic rffc nejhd  by solar Minesd system";
		Pattern g=Pattern.compile("(mine).*? ");
		Matcher m1=g.matcher(str);

		str=m1.replaceAll("wun ");
		System.out.println(str);
		
	}

}
