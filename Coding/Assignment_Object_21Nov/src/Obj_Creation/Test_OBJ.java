package Obj_Creation;

public class Test_OBJ {
	public static void main(String[] args) {

		Mouse ms = new Mouse();
		ms.click();
		ms.move();

		guitar G = new guitar();
		G.guitar();

		Car F = new Car();
		F.car();

		Keyboard K = new Keyboard();
		K.keyboard();
	}

}