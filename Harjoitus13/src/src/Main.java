package src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pokemon test = new Pokemon();
		
		test.printPhase();
		int ite = 0;
		for(int i = 0; i < 3;) {
			ite++;
			test.action();
			if (ite >= 5) {
				i++;
				ite = 0;
				test.nextPhase();
			}
			
		}


	}

}
