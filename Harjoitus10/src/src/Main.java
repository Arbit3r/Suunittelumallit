package src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double palkka = 100;
		double korko = 60;
		
		Esimies e = new Lähiesimies();
		palkka = e.handler(palkka, korko, e);

		System.out.println(palkka);
	}

}
