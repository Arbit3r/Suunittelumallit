package src;

public class Ananas extends PizzaAinekset {

	public Ananas(Pizza pizza) {
		super(pizza);
	}
	public int pizzaHinta() {
		return super.pizzaHinta() + ananas();
	}
	private int ananas() {
		return 3;
	}
	
	public String ainesNimi() {
		// TODO Auto-generated method stub
		return super.ainesNimi() + nimi();
	}
	public String nimi() {
		return "Ananas ";
	}
	
}
