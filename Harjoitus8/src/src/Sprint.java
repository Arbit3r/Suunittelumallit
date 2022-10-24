package src;

import java.util.ArrayList;

public class Sprint extends Game {

	private ArrayList<Integer> players = new ArrayList<Integer>();;

	@Override
	void initializeGame() {
		// TODO Auto-generated method stub
		System.out.println("Game Start!");
		System.out.println("With " + playersCount + " Players");
		for (int i = 0; i < playersCount; i++) {
			players.add(0);
		}
	}

	@Override
	void makePlay(int player) {
		// TODO Auto-generated method stub
		int p = players.get(player) + (int) Math.round(Math.random() * 10);
		players.set(player, p);

	}

	@Override
	boolean endOfGame() {
		// TODO Auto-generated method stub
		int p = 0;
		for (int i : players) {
			// int num = players.get(i2);
			System.out.println("Kisaaja: " + p);
			System.out.println(i + " Matka");
			p++;
			if (i >= 100) {
				return true;
			}
		}
		return false;
	}

	@Override
	void printWinner() {
		// TODO Auto-generated method stub
		int p = 0;
		for (int i : players) {
			// int num = players.get(i2);
			p++;
			if (i >= 100) {
				System.out.println("Kisaaja " + p + " Voitti kisan matkalla " + i);
			}
		}
	}

}
