package Static_Variable;

public class Main_Test {

	public static void main(String[] args) {
		A a1 = new A ();
		a1.X = a1.X + 1;
		a1.Y = a1.Y + 1;
		System.out.println(a1.X+" "+a1.Y);

		A a2 = new A ();
		a2.X = a2.X + 1;
		a2.Y = a2.Y + 1;
		System.out.println(a2.X+" "+a2.Y);

		A a3 = new A ();
		a3.X = a3.X + 1;
		a3.Y = a3.Y + 1;
		System.out.println(a3.X+" "+a3.Y);
	}
}
