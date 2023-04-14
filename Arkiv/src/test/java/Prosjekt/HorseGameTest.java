package Prosjekt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class HorseGameTest {

    @Test
    void testAddWinner() {
        var test = new HorseGame();

        HashMap <String, Integer> raceLocation = new HashMap<String, Integer>();
        raceLocation.put("Hearts", 0);
        raceLocation.put("Clubs", 0);
        raceLocation.put("Spades", 0);
        raceLocation.put("Diamonds", 0);
        assertEquals(raceLocation, test.raceLocation);
    }

    @Test
    void goForwardTest(){
        var test = new HorseGame();
        Card exampleCard = new Card('D', 2);
        test.goForward(exampleCard);
        assertEquals(1, test.raceLocation.get("Diamonds"), "Good job!");
    }

    @Test
    void randomCardRemovedFromCardDeckTest(){
        var test = new HorseGame();
        test.getRandomCard();
        assertEquals(47, test.getCardDeck().size());
    }

    @Test
    void correctWinnerTest() {
        var game = new HorseGame();
        var controller = new HorseGameController();
        game.raceLocation.put("Diamonds", 9);
        game.winnerKey();
        assertEquals("Diamonds", game.winnerKey);
    }
    
    @Test 
    void cardInitializeTest() {
		//assertTrue(checkState(new Card('S', 1), 'S', 1));
        Card card = new Card('D', 8);
        assertEquals('D', card.getSuit());
        assertEquals(8, card.getFace());

    }
}
