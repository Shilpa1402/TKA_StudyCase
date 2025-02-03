package Shopping_Calculator;

public class Grocery_Calculator {
	 public int electricalTotal(int e1, int e2) {
	        return (e1 + e2) * 115 / 100;
	    }

	    public int foodTotal(int f1, int f2) {
	        return (f1 + f2) * 108 / 100;
	    }

	    public int clothingTotal(int c1) {
	        return c1 * 118 / 100;
	    }

	    public int totalBill(int ele, int food, int cloth) {
	        return ele + food + cloth;
	    }

	    public void discountedBill(int ele1, int ele2, int food1, int food2, int cloth1) {
	        int ele = electricalTotal(ele1, ele2);
	        int food = foodTotal(food1, food2);
	        int cloth = clothingTotal(cloth1);
	        int total = totalBill(ele, food, cloth);
	        int discount = total * 20 / 100;
	        int finalBill = total - discount;

	        System.out.println("Total Bill: " + total);
	        System.out.println("Discount: " + discount);
	        System.out.println("Final Bill: " + finalBill);
	    }
	}
