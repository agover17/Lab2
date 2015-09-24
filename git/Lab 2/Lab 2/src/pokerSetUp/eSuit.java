package pokerSetUp;

public enum eSuit {
	HEARTS(1),
	DIAMONDS(2),
	CLUBS(3),
	SPADES(4);
	
	private int suit;
	
	// Constructor & getter
	private eSuit(final int suit) {
		this.suit = suit;
	}
	public int getSuit() {
		return this.suit;
	}
}
