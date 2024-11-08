package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		//ovako dobijamo razlicite objekte
		//DatabaseConnection connection1 = new DatabaseConnection();
		//DatabaseConnection connection2 = new DatabaseConnection();

		//singleton se koristi kada nam treba samo jedan objekat - jedna instanca klase
		//zato se sad ispisuju iste vrijednosti
		DatabaseConnection connection1 = DatabaseConnection.getInstance();	
		DatabaseConnection connection2 = DatabaseConnection.getInstance();		

		
		System.out.println(connection1);
		System.out.println(connection2.toString());

		
		//testiranje lazy ucitavanja
		DatabaseConnectionLazy connectionLazy1 = DatabaseConnectionLazy.getInstance();
		DatabaseConnectionLazy connectionLazy2 = DatabaseConnectionLazy.getInstance();

		System.out.println(connectionLazy1);
		System.out.println(connectionLazy2);

		
	}

}
