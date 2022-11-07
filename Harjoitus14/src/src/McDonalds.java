package src;

public class McDonalds implements Builder {

	private String patty;
	private String salad;
	private String bread;

	public String getBurger() {
		// TODO Auto-generated method stub
		return patty + " " + salad + " " + bread;
	}

	@Override
	public void build() {
		// TODO Auto-generated method stub
		this.patty = "12g patty";
		this.salad = "icemountainsalad";
		this.bread = "goodbread";

	}

}
