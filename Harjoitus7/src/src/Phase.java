package src;

public interface Phase {
	
	void nextPhase(Pokemon p);
	void prevPhase(Pokemon p);
	void currentPhase();
	void action();

}
