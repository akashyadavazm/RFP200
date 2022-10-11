package day11And12Problems;

import java.util.Random;

public class DeckOfCards {

	public static void main(String[] args) {

		String[][] PlayersCards = new String[3][3];

		Random rand = new Random();

		String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };

		String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		int t = SUITS.length * RANKS.length;
		String[] Deck = new String[t];

		for (int i = 0; i < SUITS.length; i++) {
			for (int j = 0; j < RANKS.length; j++) {
				Deck[RANKS.length * i + j] = RANKS[j] + " of " + SUITS[i];

			}

		}

		for (char ch = 'A'; ch < 'D'; ch++) {

			System.out.println(" PLAYER " + ch + " Have ");

			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < 3; j++) {
				
					int index = rand.nextInt(t);
					PlayersCards[i][j] = Deck[index];

					System.out.print(PlayersCards[i][j] + " , ");
				}

			}
			System.out.println();
		}

	}

}
