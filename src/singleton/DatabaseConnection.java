package singleton;
//SINGLETON - da bismo napravili samo jedan objekat klase

public class DatabaseConnection {
	//ovo je singleton obrazac i ovo i Test treba znati za test
	
	
	//nestrpljivo ucitavanje
	
	//zasto mora biti staticka?
	private static DatabaseConnection instance = new DatabaseConnection();
	
	private /*public*/ DatabaseConnection() {
		
	}
	
	//implementacije neke konekcije na BP
	
	public static DatabaseConnection getInstance() {
		return instance;
	}
}
