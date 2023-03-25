package LamdaExpression;
interface rt{
	public String ruh();
}
interface rt1{
	public String say(String name);

}

public class TaskPracticeIncludesALLJava8Features {
		public static void main(String[] args) { 
		rt j=()->{		
			return "Nothing to say";
		};
		
		System.out.println(j.ruh());
		
		rt1 j1=(name)->{
			return "Hello "+name;
		};
		System.out.println(j1.say("Gopi"));
		
		
	}

}
