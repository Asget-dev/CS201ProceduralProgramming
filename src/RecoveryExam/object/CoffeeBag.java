package RecoveryExam.object;

public class CoffeeBag {
	private double totalPrice;
	private double bagWeight;
	private double numberOfBags;
	private static final double pricePerLb = 5.99;
	private static final double salesTax = 0.0725;
	private double totalPriceWithTax;

	public CoffeeBag(double a, double b) {
		numberOfBags = a;
		bagWeight = b;
	}

	public double getNumberOfBags() {
		return numberOfBags;
	}

	public double getBagWeight() {
		return bagWeight;
	}

	public void setTotalPrice() {
		totalPrice = bagWeight * numberOfBags * CoffeeBag.pricePerLb;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPriceWithTax() {
		totalPriceWithTax = getTotalPrice() * getTotalPrice() * CoffeeBag.salesTax;
	}

	public double getTotalPriceWithTax() {
		return totalPriceWithTax;
	}

}
