package src;

public class Charmeleon implements Phase {

	private String name = "Charmeleon";

	@Override
	public void nextPhase(Pokemon p) {
		// TODO Auto-generated method stub
		p.setPhase(new Charizard());

	}

	@Override
	public void prevPhase(Pokemon p) {
		// TODO Auto-generated method stub
		p.setPhase(new Charmander());

	}

	@Override
	public void currentPhase() {
		// TODO Auto-generated method stub
		System.out.println(name);

	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println(":D<<<<<<");
		
	}

}
