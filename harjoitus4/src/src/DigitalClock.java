package src;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class DigitalClock implements Observer {

	private int time; 
	
	@Override
	public void update(Observable o, Object time) {
		// TODO Auto-generated method stub
		this.setTime((int) time);
		
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	
	
	
	


}
