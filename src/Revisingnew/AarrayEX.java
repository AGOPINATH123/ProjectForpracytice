package Revisingnew;
class jk{
	public void reves () {
		int number =125894634;	
		int rem;
		int rev=0;
		int count=0;
		while(number!=0) {
			rem=number%10;
			rev=rev*10+rem;
			number=number/10;
			count++;
		}
		System.out.println();
		System.out.printf("the rev int number is %d",rev);
		System.out.println("the no of iterations is "+count);
		
	}
}

public class AarrayEX {
	public static void Reverse(Integer [] as) {	
		System.out.println("The reversed array is ");

		for(int i=as.length-1;i>=0;i--) {
			System.out.print(as[i]+" ");}}

	public static void main(String[] args) {
		Integer [] as= {1,5,6,7,9,5,4,9,6,3,6,9,5,6};
		Reverse(as);
		jk wt = new jk();
		wt.reves();
	}

}
