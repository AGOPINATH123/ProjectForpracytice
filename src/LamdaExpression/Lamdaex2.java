package LamdaExpression;
interface Sayable{
	public String say(String name);
	}
interface AddAndMul{
	int add(int a ,int n);
}
public class Lamdaex2 {
	public void Sream() {
		System.out.println("hello all how are u  ");
	}

	public static void main(String[] args) {
		
		Lamdaex2 b=new Lamdaex2() {
				public void Sream() {
					System.out.println("hello world");
				}};
				
		Sayable s1=(name)->{  
			return "hello "+name;
		};
		System.out.println(s1.say("Gopi"));
		
		Sayable s2=(name)->{
		return name+" wlcome boss";	
		};
		System.out.println(s2.say("GOPI DON"));
		
		AddAndMul gh=(a,n)->(a+n);
	      System.out.println(gh.add(10, 200));
				
	
}}
