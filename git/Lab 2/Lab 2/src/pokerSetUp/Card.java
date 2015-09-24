package pokerSetUp;

public class Card {

	// Private values of class.
	private eRank rank;
	private eSuit suit;

	// Getters
	public eRank getRank() {
		return this.rank;
	}
	public eSuit getSuit() {
		return this.suit;
	}

	// Constructor
	public Card(eRank rank, eSuit suit) {
		this.rank = rank;
		this.suit = suit;
	}
}