package src;

public class Charmander implements Phase {
	
	private String name = "Charmander";
	private Visitor v = new TilanVaihto();

	@Override
	public void nextPhase(Pokemon p) {
		// TODO Auto-generated method stub
		p.setPhase(v.tilanVaihto(p));

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

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
