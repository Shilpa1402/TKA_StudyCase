
public class Calculator {
	public static void main(String[] args) {
        int mrp =999;
	String cname = "CASIO";
	int n1 =10; int n2 =20;
	}
	int add (int n1, int n2) {
		int sum = 10+20;
		System.out.println("Addition = " + sum);
		return sum;
	}
	}


class Avgrage {
	int avg(int n1, int n2) {
		Calculator C1 = new Calculator();
		int result = C1.add(10, 20);
		int avg = result/2;
		System.out.println("Average = " + avg);
		return avg;
	}
}

class Discount {
	int disc(int n1, int n2) {
	   Avgrage A1 = new Avgrage();
	   int discount = A1.avg(n1, n2);
	   int Disc = discount* 10/100;
	   System.out.println(" discount");
	return discount;
	
	
	}
}

