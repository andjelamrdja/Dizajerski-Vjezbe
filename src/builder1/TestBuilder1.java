package builder1;

public class TestBuilder1 {
	
	//prvi nacin se koristi kad unaprijed znamo vrijednsoti
	//drugi nacin koristimo kad pica moze imati 5 sastojaka, ali moze i 25

	//ako imamo ap u okviru koje postoji vise pominjanje objekata koji se dosta koriste bez promjene 
	//kada imamo unaprijed zadate vrijednosti
	//a kad bismo naoravili listu stringova npr za meso, onda bi se moglo dodati i vise vrsta
	
	public static void main(String[] args) {
		PizzaChef chef = new PizzaChef(new CapricciosaBuilder());
		
		Pizza pizza = chef.makePizza();
		
		System.out.println("Napravili smo: " + pizza);
		
	}

}
