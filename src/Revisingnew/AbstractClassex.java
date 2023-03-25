package Revisingnew;
abstract class a{
	abstract void a();
	abstract void b();
	abstract void c();
	abstract void d();
	
}
class AbsInherit extends a{

	@Override
	void a() {
System.out.println("hello A");		
	}

	@Override
	void b() {
		System.out.println("hello B");		
		
	}

	@Override
	void c() {
		System.out.println("hello C");		
		
	}

	@Override
	void d() {
		System.out.println("hello D");		
		
	}
	
}

abstract class Inter {
	int getIntrestSbi() {
		return 8;
	}

	int getintrestcanera() {
		return 9;
	}

	abstract void run1();
}

public class AbstractClassex extends Inter {

	public static void main(String[] args) {
		AbsInherit ls = new AbsInherit();
		ls.a();
		ls.b();
		ls.c();
		ls.d();
		
		AbstractClassex ex = new AbstractClassex();
		ex.run1();
		System.out.println("the sbi intrest rate is    :" + ex.getIntrestSbi() + "%");
		System.out.println("the canera intrest rate is :" + ex.getintrestcanera() + "%");
	}

	@Override
	void run1() {
		System.out.println("Hello Abstract Unimplemented method............");
	}

}
