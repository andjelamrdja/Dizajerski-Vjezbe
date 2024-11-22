package observer3;

public class TestObserver {

	public static void main(String[] args) {
		CryptoCurrencyPrice price = new CryptoCurrencyPrice();
		
		UpdateSMS update1 = new UpdateSMS(); //on nam je listener
		price.addListener(update1);
		
		price.setBitcoinPrice(10000);
		price.setEtherPrice(5000);

	}

}
