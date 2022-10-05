package src;

public class Charmander implements Phase {
	
	private String name = "Charmander";

	@Override
	public void nextPhase(Pokemon p) {
		// TODO Auto-generated method stub
		p.setPhase(new Charmeleon());

	}

	@Override
	public void prevPhase(Pokemon p) {
		// TODO Auto-generated method stub
		System.out.println("Start phase: " + name);

	}

	@Override
	public void currentPhase() {
		// TODO Auto-generated method stub
		System.out.println(name);

	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println(":D<<<");
		
	}

}
