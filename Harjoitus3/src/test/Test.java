package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laiteosa graphics = new Naytonohjain(700);
		Laiteosa ram = new Muistipiiri(120);
		Laiteosa prosessori = new Prosessori(500);
		Laiteosa verkkokortti = new Verkkokortti(100);
		
		Laiteosa emolevy = new Emolevy(prosessori,graphics,ram,verkkokortti,200);
		Laiteosa kotelo = new Kotelo(emolevy,70);
		
		
		System.out.println("build: " + kotelo.showTotal());
		
		System.out.println(graphics.getHinta());
		System.out.println(ram.getHinta());
		System.out.println(prosessori.getHinta());
		System.out.println(verkkokortti.getHinta());
		System.out.println(emolevy.getHinta());
		System.out.println(kotelo.getHinta());
		
		Laiteosa emolevy2 = new Emolevy(200);
		System.out.println(emolevy2.showTotal());
		emolevy2.setBuild(verkkokortti);
		System.out.println(emolevy2.showTotal());

	}

}
