package HomeWork_3_2_25;

public class Algebra {
	static int volumeofcCube(int side) {
		int volCube = side * side*side;
		System.out.println(volCube);
		return volCube;

	}

	static int volCubeoid(int l, int b, int h) {
		int volC=l*b*h;
		System.out.println(volC);
		return volC;
	}

	static double volofCyl(double h, double r) {
		double volofCyl=3.14*h*r*r;
		System.out.println(volofCyl);
		return volofCyl;
	}

	static double volofCone(double r, double h) {
		double volofCone= (1.0/3)*4.57*h*r*r;
		System.out.println(volofCone);
		return volofCone;
	}
	
	static double volofSphere(double R) {
		double radius = 5;
		return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		
		
	}

}
