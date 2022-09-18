package adidas;

import tasks.Factory;
import tasks.Hat;
import tasks.Pants;
import tasks.Shoes;
import tasks.Tshirt;

public class AdidasFactory implements Factory {

	@Override
	public Hat makeHat() {
		
		return new HatAdidas();
		
	}

	@Override
	public Tshirt makeTshirt() {
		
		return new TshirtAdidas();
		
	}

	@Override
	public Pants makePants() {

		return new PantsAdidas();
		
	}

	@Override
	public Shoes makeShoes() {

		return new ShoesAdidas();
		
	}

}
