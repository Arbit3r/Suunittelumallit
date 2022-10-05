package src;

public class Salami extends PizzaAinekset {
	
	public Salami(Pizza pizza) {
		super(pizza);
	}
	public int pizzaHinta() {
		return super.pizzaHinta() + salami();
	}
	private int salami() {
		return 6;
	}
	
	public String ainesNimi() {
		// TODO Auto-generated method stub
		return super.ainesNimi() + nimi();
	}
	public String nimi() {
		return "Salami ";
	}

}
