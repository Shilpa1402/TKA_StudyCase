package Homework_03_02;

public class Main_Test {

	public static void main(String[] args) {
		Volume.volofCone(5, 7);
		Volume.coneLSA(2, 7);
		Volume.coneTSA(5, 7);
		System.out.println();
		
		Volume.volCubeoid(14, 6, 7);
		Volume.cubeLSA(9);
		Volume.cubeTSA(8);
		System.out.println();
		
		Volume.volofCyl(2, 3);
		Volume.cylinderLSA(3, 4);
		Volume.cylinderTSA(8, 3);
		System.out.println();
		
		Volume.volumeofcCube(9);
		Volume.cubeLSA(2);
		Volume.cubeTSA(8);
		System.out.println();
		
		Volume.volofSphere(5);
		Volume.sphereLSA(9);
		Volume.sphereTSA(4);
		System.out.println();
		
		Volume.volofHemisphere(8);
		Volume.hemisphereLSA(2);
		Volume.sphereTSA(8);
		System.out.println();
	}
}
