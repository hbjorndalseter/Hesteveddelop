package Prosjekt;

import java.util.ArrayList;

import java.util.Random;


public abstract class CardDeck {

	// array to hold Card objects, filled in the constructor
	private static ArrayList<Card> cards = new ArrayList<>();
	private ArrayList<Card> usedCards;
	private static Random rand = new Random();
	private ArrayList<Card> originalList = new ArrayList<>();

	public CardDeck(int suitSize) {
		for (int i = 0; i < Card.SUITS.length(); i++) {
			for (int face = 2; face <= suitSize; face++) {
				Card card = new Card(Card.SUITS.charAt(i), face);
				cards.add(card);
				originalList.add(card);
			}
		}
		this.usedCards = new ArrayList<>();
		this.rand = new Random();
			
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

	public ArrayList<Card> getCardDeck(){
		return cards;
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

	public void removeUsedCard(Card card){

	}

    public Card getRandomCard(){
        // int randomNum = ThreadLocalRandom.current().nextInt(0, 52 - this.counter);
		if (cards.isEmpty()) {
            // Refill the deck with all 52 cards
			//cards = originalList;
			int randomNummer = rand.nextInt(originalList.size());
			Card kort = originalList.get(randomNummer);
			originalList.remove(kort);
			return kort;
		} else {
			int randomNum = rand.nextInt(cards.size());
			Card card = cards.get(randomNum);
			cards.remove(card);
			return card;
		}

	}
}