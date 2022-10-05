package src;

public abstract class PizzaAinekset implements Pizza {
	
	private Pizza pizza;
	
	public PizzaAinekset(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public int pizzaHinta() {
		return pizza.pizzaHinta();
	}
	
	@Override
	public String ainesNimi() {
		return pizza.ainesNimi();
	}

	

}
