package strategy;

public class TestStrategy {

	public static void main(String[] args) {
		ShoppingCart studentShoppingCart = new ShoppingCart(new StudentDiscount());
		ShoppingCart penzionerShoppingCart = new ShoppingCart(new PnezionersDiscount());

		double amount = 10000.0;
		
		System.out.println("regularna: " + amount);
		System.out.println("Studentska: " + studentShoppingCart.calculateTotal(amount));
		System.out.println("Penzionerska: " + penzionerShoppingCart.calculateTotal(amount));

		//nas projekat
//		1 interfejs
//		2 klase u jednu bin dok/u drugu text dok (sami da nadjemo kako se sta trazi)
//		jedna menadyer klasa zajednicko za obe
		
		
		//ovo samostalno radimo
		// BuffredWriter and BuffredReader mozemo koristiti za upis i citanje
		// ObjectOutputStream za ocitavanje u cuvanje crteza
		
		
		//kod bina se ne cuvaju kroaci , tu je samo crtez
		//kod tekstualnog ce biti problem
		
		//deselect ispisati sito
		//mora nas pitati za upis svake linije koju ucitavamo - najbolje preko nekog buttona, da nemamo da/ne  Dugme Load Next
		
		//u modfikaciji ispisati iz starog u novi
		//uzeti stari i provjeriti koji je on u modelu
		
	}

}
