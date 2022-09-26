package src;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Timer extends Observable {
	
	private int time;
	
	public void setTime(int time) {
		
		this.time = time;
		setChanged();
		notifyObservers(time);
	}
	

}
