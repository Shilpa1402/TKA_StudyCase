package Polymorphism_Overloading;

public class Arithmatic {
	int a = 10;
	int b =2;
	void sum (int a) {
		System.out.println(a+a);
	}
	void sum (double a) {
		System.out.println(a+a);
	}
	void sum (double a,double b) {
		System.out.println(a+b);
	}
	int sum (int a,int b) {
		System.out.println(a+b);
		return a+b;
	}
	void sum (int a,double b) {
		System.out.println(a+b);
	}
	void sum (double a,int b) {
		System.out.println(a+b);
	}

}
