package observer3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class UpdateSMS implements PropertyChangeListener {

	private double bitcoinPrice;
	private double etherPrice;
	
	
	//ovoj metodi se prosljedjuje event koji se desio
	//ovdje ce biti provjera trenutnih stanja buttona
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		//evt posjeduje onu staru vrijednost i novu vrijednost
		//postoje metode zas njihovo preuzimanje
		if(evt.getPropertyName().equals("bitcoin")) {
			this.bitcoinPrice = (double) evt.getNewValue();
		} else if(evt.getPropertyName().equals("ether")) {
			this.etherPrice = (double) this.etherPrice;
		}
		
		sendSMS();
		

	}
	
	public void sendSMS() {
		System.out.println("New bitcoin price is: " + bitcoinPrice);
		System.out.println("New ether price is: " + etherPrice);
	}

}
