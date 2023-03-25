package MethodReference;
interface Vintt{
	public void Study();
}

public class MethodrefrencwPractice {

	public  void Study() {
		System.out.println("hello world");
	}
	
	public static void main(String[] args) {
		MethodrefrencwPractice mr=new MethodrefrencwPractice();
		
		//Vintt vin=MethodrefrencwPractice::Study;
		mr.Study();
		
	}
}
