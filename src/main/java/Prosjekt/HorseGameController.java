package Prosjekt;

import java.util.ArrayList;

public class HorseGameController {
    
    public ArrayList<Integer> raceLocation; 
    private ArrayList<Card> cards;
    private Object suit;


    public HorseGameController() {
        ArrayList<Integer> raceLocation = new ArrayList<Integer>();

    }

    public void goForward(Card suit){
        this.suit = pickRandomCard().getSuit();
        if (suit.equals('A')) {
            
        }
    }



}
