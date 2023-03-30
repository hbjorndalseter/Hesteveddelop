package Prosjekt;

import java.util.ArrayList;

import java.util.concurrent.ThreadLocalRandom;


public abstract class CardDeck {

	// array to hold Card objects, filled in the constructor
	private ArrayList<Card> cards;
	private ArrayList<Card> usedCards;

	public CardDeck(int suitSize) {
		cards = new ArrayList<Card>();
		for (int i = 0; i < Card.SUITS.length(); i++) {
			for (int face = 1; face <= suitSize; face++) {
				Card card = new Card(Card.SUITS.charAt(i), face);
				cards.add(card);
			}
		}
	}

	@Override
	public String toString() {
		return "[Deck " + cards.toString().substring(1);
	}

	// public void deal(CardHand hand, int handSize) {
	// 	for (int i = 0; i < handSize; i++) {
	// 		hand.addCard(cards.remove(cards.size() - 1));
	// 	}
	// }

	public int getCardCount() {
		return cards.size();
	}

	public Card getCard(int i) {
		if (i < 0 || i >= getCardCount()) {
			throw new IllegalArgumentException(
					String.format("%s is an illegal card index, when the size of the deck is %s", i, getCardCount()));
		}
		return cards.get(i);
	}

	public void shufflePerfectly() {
		int halfSize = cards.size() / 2;
		for (int i = 0; i < halfSize; i++) {
			Card card = cards.remove(halfSize + i);
			cards.add(i * 2 + 1, card);
		}
	}

    public Card getRandomCard(){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 52 + 1);
		Card card = cards.get(randomNum);
		if (usedCards.contains(card)){
			System.out.println("Card already used!");
		}
		else{
		usedCards.add(card);
        return card;
		}        
	}
}