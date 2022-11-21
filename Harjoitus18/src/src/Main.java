package src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Viisari tunti = new Viisari(10);
		Viisari minuutti = new Viisari(45);
		
		Puukello kello = new Puukello(tunti,minuutti);
		System.out.println(kello.toString());
		
		Puukello kelloclone = (Puukello) kello.clone();
		System.out.println(kelloclone.toString());
		
		//Viisari tunti2 = new Viisari(12);
		
		tunti.setAika(11);
		
		//kelloclone.setTunti(tunti2);
		System.out.println(kello);
		System.out.println(kelloclone);

	}

}
