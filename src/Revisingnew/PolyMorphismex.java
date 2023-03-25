package Revisingnew;

interface one {
	public void solid();

	void fast();
}

public class PolyMorphismex implements one {

	static void nan() {
		System.out.println("hello nana");

	}

	static void nan(int i) {
		System.out.println("i value is " + i);

	}

	static void nan(int i, int j) {
		System.out.println((i + j) + " the sum");

	}

	public static void main(String[] args) {
		PolyMorphismex ex=new PolyMorphismex(); 
		nan();
		nan(23);
		nan(11, 23);
		ex.solid();
		ex.fast();
	}

	@Override
	public void solid() {
		System.out.println("Hello solid");
	}

	@Override
	public void fast() {
		System.out.println("Hello fast");
	}

}
