package CastingUpAndDown.com;

public class OuterClass {
	public void num() {
		System.out.println("Hello Num");
		
	}
	class Inner{
		public void bar() {
			System.out.println("Hello bar");
		}
	}
	

	public static void main(String[] args) {
		OuterClass gg=new OuterClass();
		gg.num();
		OuterClass.Inner gh=gg.new Inner();
		gh.bar();
	}

}
