package pokerSetUp;

public enum eSuit {
	// enum values
	DIAMONDS(1), HEARTS(2), CLUBS(3), SPADES(4);
	
	// Attributes
	private int suit;
	
	// Constructor 
	private eSuit(int suit) {
		this.suit = suit;
	}
}
