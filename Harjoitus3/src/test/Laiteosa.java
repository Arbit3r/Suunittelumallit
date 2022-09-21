package test;


public interface Laiteosa {
	
	double Hinta = 0;
	
	public abstract void setHinta(double hinta);
	
	public abstract double getHinta();
	
	public abstract double showTotal();
	
	public abstract void setBuild(Laiteosa o);
}
