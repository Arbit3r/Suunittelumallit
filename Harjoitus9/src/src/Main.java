package src;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<String>();
		lista.add("first");
		lista.add("second");
		lista.add("third");
		lista.add("fourth");
		ListConverter c = new AfterEvery();
		System.out.println(c.listToString(lista));
		c = new EverySecond();
		System.out.println(c.listToString(lista));
		c = new EveryThird();
		System.out.println(c.listToString(lista));

	}

}
