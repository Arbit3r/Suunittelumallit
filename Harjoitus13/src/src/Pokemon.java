package src;

public class Pokemon {
	
	private Phase phase = new Charmander();

	public Phase getPhase() {
		return phase;
	}

	public void setPhase(Phase phase) {
		this.phase = phase;
	}
	
	public void previousPhase() {
        phase.prevPhase(this);
    }

    public void nextPhase() {
        phase.nextPhase(this);
    }

    public void printPhase() {
        phase.currentPhase();
    }
    public void action() {
    	phase.action();
    }
    public String getName() {
    	return phase.getName();
    }

}
