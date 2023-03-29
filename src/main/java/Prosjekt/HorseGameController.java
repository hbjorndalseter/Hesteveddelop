package Prosjekt;

import java.util.ArrayList;
import java.util.HashMap;

public class HorseGameController {
    
    public HashMap<String, Integer> raceLocation; 
    private ArrayList<Card> cards;
    private Object suit;


    public HorseGameController() {
        HashMap<String, Integer> raceLocation = new HashMap<String, Integer>();
        raceLocation.put("Hearts", 0);
        raceLocation.put("Clubs", 0);
        raceLocation.put("Spades", 0);
        raceLocation.put("Diamonds", 0);
    }

    public void goForward(Card suit){
        this.suit = pickRandomCard().getSuit();

        if (suit.equals('H')) {
            int currentValue = raceLocation.get("Hearts");
            raceLocation.put("Hearts", currentValue + 1);
            }
        if (suit.equals('C')) {
            int currentValue = raceLocation.get("Clubs");
            raceLocation.put("Clubs", currentValue + 1);
            }
        if (suit.equals('S')) {
            int currentValue = raceLocation.get("Spades");
            raceLocation.put("Spades", currentValue + 1);
            }
        if (suit.equals('D')) {
            int currentValue = raceLocation.get("Diamonds");
            raceLocation.put("Diamonds", currentValue + 1);
            }
    }

    public void goBackwards(Card suit){
        this.suit = randomTableCard().getSuit();

        if (suit.equals('H')) {
            int currentValue = raceLocation.get("Hearts");
            raceLocation.put("Hearts", currentValue - 1);
            }
        if (suit.equals('C')) {
            int currentValue = raceLocation.get("Clubs");
            raceLocation.put("Clubs", currentValue - 1);
            }
        if (suit.equals('S')) {
            int currentValue = raceLocation.get("Spades");
            raceLocation.put("Spades", currentValue - 1);
            }
        if (suit.equals('D')) {
            int currentValue = raceLocation.get("Diamonds");
            raceLocation.put("Diamonds", currentValue - 1);
            }
    }

    

    




}
