package pokerSetUp;

import java.util.*;

public class Deck {
	
	// Attributes
	private ArrayList<Deck> deck = new ArrayList<Deck>();
	
	// Getter
	public ArrayList getDeck() {
		return this.deck;
	}
	
	// Constructor
	// Need to fix
	public Deck(ArrayList deck) {
		this.deck = deck;

		// Build the deck (add cards)
		// Loop x4 for the suits
		for (int i = 1; i < 5; i++) {
			// Loop x14 for each individual rank
			for (int j = 2; j < 15; j++) {
				// Need to fix this.
				// deck.add();
			}
		}
	}
}
