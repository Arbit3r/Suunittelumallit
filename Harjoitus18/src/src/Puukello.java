package src;

public class Puukello extends Kello {
	
	private Viisari tunti;
	private Viisari minuutti;
	
	

	public Puukello(Viisari tunti, Viisari minuutti) {
		super();
		this.tunti = tunti;
		this.minuutti = minuutti;
	}



	@Override
	public Kello clone() {
		// TODO Auto-generated method stub
		Puukello kelloClone = new Puukello(this.tunti,this.minuutti);
		
		return kelloClone;
	}



	public Viisari getTunti() {
		return tunti;
	}



	public void setTunti(Viisari tunti) {
		this.tunti = tunti;
	}



	public Viisari getMinuutti() {
		return minuutti;
	}



	public void setMinuutti(Viisari minuutti) {
		this.minuutti = minuutti;
	}
	@Override
	public String toString() {
		return tunti.getAika() + ":" + minuutti.getAika();
	}
	
	

}
