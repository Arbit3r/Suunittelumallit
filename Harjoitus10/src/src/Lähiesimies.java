package src;

public class Lähiesimies extends Esimies {


	@Override
	public double handler(double palkka,double korko, Esimies e) {
		// TODO Auto-generated method stub
		if(korko > 2) {
			System.out.println("Liian iso");
			e = new YksikönPäälikkö();
			return e.handler(palkka, korko, e);
		}
		return palkka * (korko/100+1);
	}

}
