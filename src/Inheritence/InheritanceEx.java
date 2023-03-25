package Inheritence;

public class InheritanceEx // Multilevel Inheritance
{ 
	int n=4;
	public void need() {
		System.out.println("hero");
	
	if(n==1)System.out.println("1");
	else if(n==2)System.out.println("2");
	else if(n==3)System.out.println("3");
	else System.out.println("4");
	}
	public static void main(String[] args) {
		
		InheritanceEx rd=new InheritanceEx();
		rd.need();
    }}
