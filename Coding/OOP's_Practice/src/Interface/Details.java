package Interface;

public class Details implements Animal {

	@Override
	public void animalName() {
		System.out.println("Dog");
	}

	@Override
	public void animalAge() {
		System.out.println("he is 2 years old");
	}
}
