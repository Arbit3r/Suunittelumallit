package test;

public class Kotelo implements Laiteosa {

	private Laiteosa emolevy;
	private double Hinta = 0;
	
	public Kotelo(double hinta) {
		super();
		Hinta = hinta;
	}

	public Kotelo(Laiteosa emolevy, double hinta) {
		super();
		this.emolevy = emolevy;
		Hinta = hinta;
	}

	@Override
	public double getHinta() {
		return Hinta;
	}


	@Override
	public void setHinta(double hinta) {
		Hinta = hinta;
	}

	@Override
	public double showTotal() {
		// TODO Auto-generated method stub
		return Hinta + emolevy.showTotal();
	}

	@Override
	public void setBuild(Laiteosa o) {
		emolevy = o;
		
	}
	
	
	
	

}
