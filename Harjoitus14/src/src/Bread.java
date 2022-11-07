package src;

public class Bread implements Item {

	private String type;

	public Bread(String type) {
		super();
		this.type = type;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

}
