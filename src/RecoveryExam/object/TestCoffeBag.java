package RecoveryExam.object;

import java.util.Scanner;

public class TestCoffeBag {

	public static void main(String[] args) {

		Scanner x1 = new Scanner(System.in);
		System.out.println("Enter number of bag");
		double x = x1.nextDouble();
		System.out.println("Enter number of weight");
		double y = x1.nextDouble();

		CoffeeBag c1 = new CoffeeBag(x, y);
		System.out.println("Number of bags sold: " + c1.getNumberOfBags());
		System.out.println("weight per bag" + c1.getBagWeight());
		c1.setTotalPrice();
		c1.setTotalPriceWithTax();
		System.out.println("Price per pound: ");
		System.out.println("Sales tax: " + c1.getTotalPrice());
		System.out.println("Total price" + c1.getTotalPriceWithTax());

	}

}
