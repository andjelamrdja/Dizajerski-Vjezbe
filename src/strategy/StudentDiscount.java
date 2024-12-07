package strategy;

public class StudentDiscount implements DiscountStrategy {

	@Override
	public double calculateDiscount(double amount) {
	
		return amount * 0.1; //samo iznos popusta
	}

}
