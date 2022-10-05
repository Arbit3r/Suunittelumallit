package src;

public class Pekoni extends PizzaAinekset {
	
	public Pekoni(Pizza pizza) {
		super(pizza);
	}
	public int pizzaHinta() {
		return super.pizzaHinta() + pekoni();
	}
	private int pekoni() {
		return 6;
	}
	
	public String ainesNimi() {
		// TODO Auto-generated method stub
		return super.ainesNimi() + nimi();
	}
	public String nimi() {
		return "Pekoni ";
	}

}
