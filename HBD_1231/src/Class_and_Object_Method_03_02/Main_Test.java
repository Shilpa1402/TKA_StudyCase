package Class_and_Object_Method_03_02;

public class Main_Test {

	public static void main(String[] args) {
		A a1 = new A();
		double r = a1.calAns(5, 7);
		System.out.println(r);

		double ans = a1.calAns(10, 2);
		System.out.println(ans);

		double ans1= a1.calAns(10,5);
		System.out.println(ans1);

		B b1 = new B();
		//  double  ans2 = b1.calAreaTriangle(4, 5);
		System.out.println(ans);


		double r1 = b1.cube(20);
		System.out.println(r1);
		double res = b1.areofSpare(10);
		System.out.println(res);
	}

	}


