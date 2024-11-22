package observer1;

public interface Observer {
	//pored ovoga pravimo i interfaca Observable koji ima tri metode
	
	//Observer obavezno ima jednu metodu
	
	//obiljezja se odmah moraju navesti u interfejsu
	//to je i problem ovog nacina jer se moze zahtijevati puno obiljezja
	//zato ovaj Observer1 necemo koristiti
	void update(double bitcoinPrice, double etherPrice);
	
}
