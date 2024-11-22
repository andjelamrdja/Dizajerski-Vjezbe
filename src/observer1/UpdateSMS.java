package observer1;

public class UpdateSMS implements Observer {
	//ovdje koristimo Observer koji smo mi kreirali
	//njega smo dodali
	
	//UpdateSMS nam dodje kao neki servis
	
	private double bitcoinPrice;
	private double etherPrice;
	
	@Override
	public void update(double bitcoinPrice, double etherPrice) {
		this.bitcoinPrice = bitcoinPrice;
		this.etherPrice = etherPrice;
		
		sendSMS();

	}
	
	public void sendSMS() {
		System.out.println("New bitcoin price is: " + bitcoinPrice);
		System.out.println("New ether price is: " + etherPrice);
	}

}
