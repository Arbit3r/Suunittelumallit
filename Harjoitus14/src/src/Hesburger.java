package src;

import java.util.ArrayList;

public class Hesburger implements Builder {

	private ArrayList<String> burger = new ArrayList<String>();
	private Item jäävuori = new Salad("jäävuori");
	private Item pihvi = new Patty("20g");
	private Item leipä = new Bread("hyväleipä");

	public ArrayList<String> getBurger() {
		return burger;
	}

	@Override
	public void build() {
		burger.add(jäävuori.getType());
		burger.add(pihvi.getType());
		burger.add(leipä.getType());
	}

}
