package observer1;

import java.util.ArrayList;
import java.util.Iterator;

public class CryptoCurrencyPrice implements Observable {

	//imacemo za svaki  model, lista selektovanih,....
	//u kontroleru treba pozvati observer nakon svake komande
	//u okviru command obrasca isto moze? - ali poslije svake naredbe
	//iz modela kontrolisemo listu, iz frame-a dugmice
	
	//kada se promijeni bitcoinPrice pozove se notify
	
	private double bitcoinPrice;
	private double etherPrice;
	
	//svaki Observable ima listu observera
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		//ima za cilj da obavijesti observere o promjeni
		//prolazi kroz listu i svakom govori e promjena se desila
		
		Iterator<Observer> it = observers.iterator();
		while(it.hasNext())
			it.next().update(bitcoinPrice, etherPrice);
	}
	
	public void setBitcoinPrice(double bitcoinPrice) {
		this.bitcoinPrice = bitcoinPrice;
		notifyObserver();
	}

	public void setEtherPrice(double etherPrice) {
		this.etherPrice = etherPrice;
		notifyObserver();
	}
	
	

}
