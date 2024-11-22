package observer2;
import java.util.Observable;

public class CryptoCurrencyPrice extends Observable {
	//ni observer2 ne korisitmo
	//mi koristimo treci nacin
	
	//kod ovog drugog koristimo ugradjenje biblioteke

	private double bitcoinPrice;
	private double etherPrice;
	
	
	public double getBitcoinPrice() {
		return bitcoinPrice;
	}
	public void setBitcoinPrice(double bitcoinPrice) {
		this.bitcoinPrice = bitcoinPrice;
		//setVhange postavlja true vrijednost u pozadini da se promjena trenutno desava
		setChanged();
		//onda se obavjestavaju svi observeri
		notifyObservers();
		
	}
	public double getEtherPrice() {
		return etherPrice;
	}
	public void setEtherPrice(double etherPrice) {
		this.etherPrice = etherPrice;
	
		setChanged();
		notifyObservers();
	}
	
	
}
