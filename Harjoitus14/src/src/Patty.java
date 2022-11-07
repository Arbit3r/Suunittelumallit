package src;

public class Patty implements Item {

	private String type;

	public Patty(String type) {
		super();
		this.type = type;
	}

	@Override
	public String getType() {
		return type;
	}

}
