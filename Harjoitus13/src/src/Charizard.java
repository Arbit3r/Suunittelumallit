package src;

public class Charizard implements Phase {

	private String name = "Charizard";
	private Visitor v = new TilanVaihto();

	@Override
	public void nextPhase(Pokemon p) {
		// TODO Auto-generated method stub
		p.setPhase(v.tilanVaihto(p));

	}

	@Override
	public void prevPhase(Pokemon p) {
		// TODO Auto-generated method stub
		p.setPhase(new Charmeleon());

	}

	@Override
	public void currentPhase() {
		// TODO Auto-generated method stub
		System.out.println(name);

	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println(":D<<<<<<<<<<<");
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
