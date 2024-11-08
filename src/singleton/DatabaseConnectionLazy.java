package singleton;

public class DatabaseConnectionLazy {

	//lazy loading
	
	
	private static DatabaseConnectionLazy instance; //ne kreiramo novi objekat
	
	private DatabaseConnectionLazy() {
		
	}

	public static DatabaseConnectionLazy getInstance() {
		if(instance == null)
			synchronized(DatabaseConnectionLazy.class) { //ako je prva if provjera popustila zbog npr dvije osobe koje koriste aplikaciju
				if(instance == null) { 
					instance = new DatabaseConnectionLazy(); //ovdje ga kreiramo da se ne bi svaki put novi kreirao
				}
			}
		return instance;
	}
	
	
}
