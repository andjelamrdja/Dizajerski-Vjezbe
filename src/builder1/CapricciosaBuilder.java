package builder1;

public class CapricciosaBuilder implements PizzaBuilder {

	//radimo za pizza lazy loading - znaci kreiracemo objekat Pizza tek kad nam zatreba
	private Pizza pizza;
	
	public CapricciosaBuilder() {
		this.pizza = new Pizza();
	}
	
	@Override
	public void putDough() {
		pizza.setDough("Klasicno");
	}

	@Override
	public void putSauce() {
		pizza.setSauce("Paradajz sos");
	}

	@Override
	public void putCheese() {
		pizza.setCheese("Mozzarella");
	}

	@Override
	public void putMeat() {
		pizza.setMeat("Sunka");
	}

	@Override
	public Pizza getPizza() {
		return this.pizza;
	}

}
