package CastingUpAndDown.com;

public class Casting {
	public static void doAnimalStuff(Animal animal) {

		if (animal instanceof Dog) {
			Dog gg1 = (Dog) animal;
			gg1.Howl();
			gg1.makeNoise();
		} else if (animal instanceof Cat) {
			Cat gg2 = (Cat) animal;
			gg2.Howl();
			gg2.makeNoise();
		} else {
			System.out.println("nothing");
		}

	}

	public static void main(String[] args) {
		Animal Refer = new Dog(); // UPCASTING
		Dog gg1 = new Dog();
		Cat gg2 = new Cat();
		doAnimalStuff(gg1);
		doAnimalStuff(gg2);

	}
}
