package Homework_03_02;

public class Volume {
	//1)
	static int volumeofcCube(int side) {
		int volCube = side * side*side;
		System.out.println(volCube);
		return volCube;
	}
	static double cubeLSA(double a) {
		double cubeLSA = 4*a*a;
		System.out.println(cubeLSA);
		return cubeLSA;
	}
	static double cubeTSA(double a) {
		double cubeTSA = 6*a*a;
		System.out.println(cubeTSA);
		return cubeTSA;
	}


	//2)
	static int volCubeoid(int l, int b, int h) {
		int volCubeoid=l*b*h;
		System.out.println(volCubeoid);
		return volCubeoid;
	}
	static double cuboidLSA(double l ,double b,double h) {
		double cuboidLSA = 2*h*(l+b);
		System.out.println(cuboidLSA);
		return cuboidLSA;
	}
	static double cuboidTSA(double l ,double b,double h) {
		double cuboidTSA = 2*((l*b)+(b*h)+(h*l));//10 5 2
		System.out.println(cuboidTSA);
		return cuboidTSA;
	}


	//3)
	static double volofCyl(double h, double r) {
		double volofCyl=3.14*h*r*r;
		System.out.println(volofCyl);
		return volofCyl;
	}
	static double cylinderLSA(double a, double b) {
		double cylinderLSA = 2*3.14*a*b;
		System.out.println(cylinderLSA);
		return cylinderLSA;
	}
	static double cylinderTSA(double a, double b) {
		double cylinderTSA = 2*3.14*a*(a+b);
		System.out.println(cylinderTSA);
		return cylinderTSA;
	}

	//4)
	static double volofCone(double r, double h) {
		double volofCone= (1.0/3)*4.57*h*r*r;
		System.out.println(volofCone);
		return volofCone;
	}
	static double coneLSA(double a, double b) {
		double coneLSA = 3.14*a*b;
		System.out.println(coneLSA);
		return coneLSA;
	}
	static double coneTSA(double a, double b) {
		double coneTSA = 3.14*a*(a+b);
		System.out.println(coneTSA);
		return coneTSA;
	}

	//5)
	static double volofSphere(double radius) {
		double volofSphere = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		System.out.println(volofSphere);
		return volofSphere ;
	}
	static double sphereLSA(double r) {
		double sphereLSA = 4*3.14*r*r;
		System.out.println(sphereLSA);
		return sphereLSA;
	}
	static double sphereTSA(double r) {
		double sphereTSA = 4*3.14*r*r;
		System.out.println(sphereTSA);
		return sphereTSA;
	}

	//6)
	static double volofHemisphere(double radius) {
		double volofHemisphere = (2.0/3.0) * Math.PI * Math.pow(radius, 3);
		System.out.println(volofHemisphere);
		return volofHemisphere;
	}
	static double hemisphereLSA(double r) {
		double hemisphereLSA = 2*3.14*r*r;
		System.out.println(hemisphereLSA);
		return hemisphereLSA;
	}
	static double hemisphereTSA(double r) {
		double hemisphereTSA = 3*3.14*r*r;
		System.out.println(hemisphereTSA);
		return hemisphereTSA;
	}

}
