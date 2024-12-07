package builder1;

public class PizzaChef {

	private PizzaBuilder pizzaBuilder;

	public PizzaChef(PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
	}
	
	//pravljenje se svodi na pozivanju put metoda za sva obiljezja
	
	public Pizza makePizza() {
		this.pizzaBuilder.putDough();
		this.pizzaBuilder.putSauce();
		this.pizzaBuilder.putCheese();
		this.pizzaBuilder.putMeat();
		
		return this.pizzaBuilder.getPizza();
		
	}
	
	
	
}
