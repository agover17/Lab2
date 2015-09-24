package pokerSetUp;

public class Card {
	
	// Attributes 
	private eRank rank;
	private eSuit suit;
	
	// Getters
	private eRank getRank() {
		return this.rank;
	}
	private eSuit getSuit() {
		return this.suit;
	}
	
	// Constructor
	public Card(eSuit suit, eRank rank) {
		this.rank = rank;
		this.suit = suit;
	}
}
