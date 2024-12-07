package strategy;

public class PnezionersDiscount implements DiscountStrategy {

	@Override
	public double calculateDiscount(double amount) {
		
		return amount * 0.25;
	}

}
