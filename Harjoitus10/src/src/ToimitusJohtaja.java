package src;

public class ToimitusJohtaja extends Esimies {
	
	@Override
	public double handler(double palkka, double korko, Esimies e) {
		// TODO Auto-generated method stub
		return palkka * (korko/100+1);
	}
}
