package observer3;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class CryptoCurrencyPrice {
 // sto je prije bilo Observable - sad je Support
	
	//mi ovaj observer koristimo
	

	private double bitcoinPrice;
	private double etherPrice;
	
	//naci neka objasnjenja za ovo!!!!
	
	//imprtovati iz java beansa
	private PropertyChangeSupport propertyChangeSupport;
	
	public CryptoCurrencyPrice() {
		propertyChangeSupport = new PropertyChangeSupport(this); // this prosljedjuje ovu klasu sto mu daje do znanja da je buduci support ova klasa u kojoj pisemo
		
	}
	
	public void addListener(PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(listener);
	}
	
	public void removeListener(PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	public void setBitcoinPrice(double bitcoinPrice) {
		//cuvamo vrijednosti
		
		//ovo fire je u stvari notify i cuva stare i nove vrijednosti koje mozemo korsititi
		propertyChangeSupport.firePropertyChange("bitcoin", this.bitcoinPrice, bitcoinPrice);
		this.bitcoinPrice = bitcoinPrice;
	}

	public void setEtherPrice(double etherPrice) {
		propertyChangeSupport.firePropertyChange("ether", this.etherPrice, etherPrice);
		this.etherPrice = etherPrice;
	}
	
	
}
