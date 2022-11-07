package src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hesburger hesburger = new Hesburger();
		McDonalds ronald = new McDonalds();
		hesburger.build();
		ronald.build();

		System.out.println(ronald.getBurger());
		System.out.println(hesburger.getBurger().toString());

	}

}
