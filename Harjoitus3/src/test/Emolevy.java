package test;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {
	
	private double Hinta = 0;
	
	private List<Laiteosa> osat = new ArrayList<>();

	public Emolevy(double hinta) {
		super();
		Hinta = hinta;
	}



	public Emolevy(Laiteosa prosessori, Laiteosa naytonohjain, Laiteosa ram, Laiteosa verkkokortti, double hinta) {
		this.osat.add(prosessori);
		this.osat.add(naytonohjain);
		this.osat.add(ram);
		this.osat.add(verkkokortti);
		this.Hinta = hinta;
	}



	@Override
	public void setHinta(double hinta) {
		
		this.Hinta = hinta;
		
	}

	@Override
	public double getHinta() {
		// TODO Auto-generated method stub
		return Hinta;
	}

	@Override
	public double showTotal() {
		// TODO Auto-generated method stub
		double sum = 0;
		for (Laiteosa current : osat) {
			sum = current.getHinta();
		}
		return Hinta + sum;
	}

	@Override
	public void setBuild(Laiteosa o) {
		osat.add(o);
	}
	
	
	

	

	
}
