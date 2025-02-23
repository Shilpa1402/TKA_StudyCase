package Constructor;

public class Point_07 {
	int a;
	int b;

	Point_07 (){
		super();
		System.out.println("Default Constructor");
	}

	public Point_07(int a) {
		this();
		this.a = a;
		System.out.println("cons with single para");
	}

	public Point_07(int a, int b) {
		this(a+50);
		this.a = a;
		this.b = b;
		System.out.println("cons with double para");
	}


}


