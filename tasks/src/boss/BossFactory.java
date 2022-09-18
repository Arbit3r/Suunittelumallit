package boss;

import tasks.Factory;
import tasks.Hat;
import tasks.Pants;
import tasks.Shoes;
import tasks.Tshirt;

public class BossFactory implements Factory {

	@Override
	public Hat makeHat() {
		// TODO Auto-generated method stub
		return new HatBoss();
	}

	@Override
	public Tshirt makeTshirt() {
		// TODO Auto-generated method stub
		return new TshirtBoss();
	}

	@Override
	public Pants makePants() {
		// TODO Auto-generated method stub
		return new PantsBoss();
	}

	@Override
	public Shoes makeShoes() {
		// TODO Auto-generated method stub
		return new ShoesBoss();
	}

}
