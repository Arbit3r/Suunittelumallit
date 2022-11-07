package src;

public class TilanVaihto implements Visitor {

	@Override
	public Phase tilanVaihto(Pokemon p) {
		// TODO Auto-generated method stub
		switch (p.getName()) {

		case "Charmander":
			return new Charmeleon();
		case "Charmeleon":
			return new Charizard();
		case "Charizard":
			System.out.println("Last phase: " + p.getName());
			break;

		}
		return p.getPhase();

	}

}
