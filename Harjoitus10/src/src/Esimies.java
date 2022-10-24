package src;

public abstract class Esimies {


	public double handler(double palkka, double korko, Esimies e) {
		return e.handler(palkka, korko, e);
	}


	

}
