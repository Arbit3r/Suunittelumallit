package src;

public class Kinkku extends PizzaAinekset {

	public Kinkku(Pizza pizza) {
		super(pizza);
	}
	public int pizzaHinta() {
		return super.pizzaHinta() + kinkku();
	}
	private int kinkku() {
		return 2;
	}
	
	public String ainesNimi() {
		// TODO Auto-generated method stub
		return super.ainesNimi() + nimi();
	}
	
	public String nimi() {
		return "Kinkku ";
	}

}
