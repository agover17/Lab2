package pokerBase;

import java.util.ArrayList;

import pokerEnums.eGame;
import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Rule {

	private int MaxNumberOfPlayers;
	private int NumberOfCards;
	private int NumberOfJokers;
	private int CommunityCards;
	private ArrayList<Card> RuleCards = new ArrayList<Card>();

	public Rule(eGame gme) {
		switch (gme) {
		case FiveStud: {
			this.MaxNumberOfPlayers = 4;
			this.NumberOfCards = 5;
			this.NumberOfJokers = 0;
			this.CommunityCards = 0;
			break;
		}
		case FiveStudOneJoker: {
			this.MaxNumberOfPlayers = 4;
			this.NumberOfCards = 5;
			this.NumberOfJokers = 1;
			this.CommunityCards = 0;
			break;
		}
		case FiveStudTwoJoker: {
			this.MaxNumberOfPlayers = 4;
			this.NumberOfCards = 5;
			this.NumberOfJokers = 2;
			this.CommunityCards = 0;
			break;
		}
		case TexasHoldEm: {
			this.MaxNumberOfPlayers = 8;
			this.NumberOfCards = 2;
			this.NumberOfJokers = 0;
			this.CommunityCards = 5;
			break;
		}
		case Omaha: {
			this.MaxNumberOfPlayers = 6;
			this.NumberOfCards = 4;
			this.NumberOfJokers = 0;
			this.CommunityCards = 5;
			break;
		}
		case SevenDraw: {
			this.MaxNumberOfPlayers = 4;
			this.NumberOfCards = 7;
			this.NumberOfJokers = 0;
			this.CommunityCards = 0;
			break;
		}
		case DeucesWild: {
			this.MaxNumberOfPlayers = 4;
			this.NumberOfCards = 5;
			this.NumberOfJokers = 0;
			// Removed int parameter.
			this.RuleCards.add(new Card(eSuit.DIAMONDS, eRank.TWO));
			this.RuleCards.add(new Card(eSuit.HEARTS, eRank.TWO));
			this.RuleCards.add(new Card(eSuit.SPADES, eRank.TWO));
			this.RuleCards.add(new Card(eSuit.CLUBS, eRank.TWO));
			this.CommunityCards = 0;
			break;
		}
		case AcesAndEights: {
			this.MaxNumberOfPlayers = 4;
			this.NumberOfCards = 2;
			this.NumberOfJokers = 0;
			this.RuleCards.add(new Card(eSuit.DIAMONDS, eRank.ACE));
			this.RuleCards.add(new Card(eSuit.HEARTS, eRank.ACE));
			this.RuleCards.add(new Card(eSuit.SPADES, eRank.ACE));
			this.RuleCards.add(new Card(eSuit.CLUBS, eRank.ACE));
			this.RuleCards.add(new Card(eSuit.DIAMONDS, eRank.EIGHT));
			this.RuleCards.add(new Card(eSuit.HEARTS, eRank.EIGHT));
			this.RuleCards.add(new Card(eSuit.SPADES, eRank.EIGHT));
			this.RuleCards.add(new Card(eSuit.CLUBS, eRank.EIGHT));
			this.CommunityCards = 0;
			break;
		}
		}
	}

	public int GetMaxNumberOfPlayers() {
		return this.MaxNumberOfPlayers;
	}

	public int GetNumberOfCards() {
		return this.NumberOfCards;
	}

	public int GetNumberOfJokers() {
		return this.NumberOfJokers;
	}

	public int GetCommunityCardsCount() {
		return this.CommunityCards;
	}

	public ArrayList<Card> GetRuleCards() {
		return this.RuleCards;
	}
}