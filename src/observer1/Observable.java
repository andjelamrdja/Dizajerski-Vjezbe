package observer1;

public interface Observable {
	//ima tri metode
	
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObserver();
	
	
}
