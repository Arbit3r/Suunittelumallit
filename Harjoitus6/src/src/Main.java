package src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza Communism = new Kinkku(new PizzaPohja());
		System.out.println(Communism.ainesNimi());
		System.out.println("Hinta: " + Communism.pizzaHinta() + "€");
		Pizza Americana = new Kinkku(new Ananas(new PizzaPohja2()));
		System.out.println(Americana.ainesNimi());
		System.out.println("Hinta: " + Americana.pizzaHinta() + "€");
		Pizza MeatLover = new Kinkku(new Pekoni(new Salami(new PizzaPohja())));
		System.out.println(MeatLover.ainesNimi());
		System.out.println("Hinta: " + MeatLover.pizzaHinta() + "€");
	}

}
