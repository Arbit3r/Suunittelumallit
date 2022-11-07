package src;

public class Salad implements Item {

	private String type;

	public Salad(String type) {
		super();
		this.type = type;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

}
