package src;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer t = new Timer();
		DigitalClock c = new DigitalClock();
		DigitalClock c2 = new DigitalClock();
		
		t.addObserver(c);
		t.addObserver(c2);
		t.setTime(1400);
		System.out.println(c.getTime());
		System.out.println(c2.getTime());
	}

}
