package src;

public class YksikönPäälikkö extends Esimies {


	@Override
	public double handler(double palkka, double korko, Esimies e) {
		// TODO Auto-generated method stub
		if(korko > 5) {
			System.out.println("Liian iso");
			e = new ToimitusJohtaja();
			return e.handler(palkka, korko, e);
		}
		return palkka * (korko/100+1);
	}

}
