package test;

public class Verkkokortti implements Laiteosa {
	
	private double Hinta = 0;
	
	

	public Verkkokortti(double hinta) {
		super();
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
		return Hinta;
	}

	@Override
	public void setBuild(Laiteosa o) {
		// TODO Auto-generated method stub
		
	}
	
	

}
