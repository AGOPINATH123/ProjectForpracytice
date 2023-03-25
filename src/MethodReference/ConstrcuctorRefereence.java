package MethodReference;
interface Messageble{
	Messageble1 message(String msg);
}
class Messageble1{
	Messageble1(String msg){
		System.out.println("hello "+ msg);
	}
	
}
public class ConstrcuctorRefereence {

	public static void main(String[] args) {
		Messageble hi=Messageble1::new;
		hi.message("hello boss");
	}

}
