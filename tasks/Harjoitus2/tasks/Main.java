package tasks;

import adidas.AdidasFactory;
import boss.BossFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jasper opJasper = new Jasper();
		Factory factory = new AdidasFactory();
		opJasper.setHat(factory.makeHat());
		opJasper.setTshirt(factory.makeTshirt());
		opJasper.setPants(factory.makePants());
		opJasper.setShoes(factory.makeShoes());
		opJasper.showOff();
		factory = new BossFactory();
		opJasper.setHat(factory.makeHat());
		opJasper.setTshirt(factory.makeTshirt());
		opJasper.setPants(factory.makePants());
		opJasper.setShoes(factory.makeShoes());
		opJasper.showOff();

	}

}
