package Prosjekt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class HorseGame extends CardDeck {

    HashMap<String, Integer> winners;
    public HashMap<String, Integer> raceLocation; 
    List<String> users;
    Card suit;
    int counter;
    List<Integer> locationValue;
    

    public HorseGame(){

        super(52);

        this.winners = new HashMap<String, Integer>();
        this.raceLocation = new HashMap<String, Integer>();
        this.users = new ArrayList<>();
        this.locationValue = new ArrayList<>();

        raceLocation.put("Hearts", 0);
        raceLocation.put("Clubs", 0);
        raceLocation.put("Spades", 0);
        raceLocation.put("Diamonds", 0);

    }

    // @Override
    // public void newGame(String...userNames) {
    //     if(userNames.length <= 5){
    //         return;
    //     }
    //     else{
    //         for (String userName : userNames){
    //             this.createUsername(userName);
    //         }
    //         this.runGame();
    //     }
    // }

    // @Override
    // public void runGame() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'runGame'");
    // }

    // @Override
    // public void addWinner() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'addWinner'");
    // }

    // @Override
    // public void createUsername(String userName) {
    //     if(!(userName.matches("[a-zA-Z]+"))){
    //         for (String user : users){
    //             if(user.equalsIgnoreCase(userName))
    //         throw new IllegalArgumentException("Username can only consist of letters, or the username already exists");
    //         }
    //     }
    //     else{this.users.add(userName);
    //     }
    // }

     // @Override
    // public void endGame() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'endGame'");
    // }

    public Card pickRandomCard(){
        return getRandomCard();
    }
    
    public Card randomTableCard(){
        if (!(this.counter % 4 == 0)) {
        
            if(!(Collections.min(locationValue) > this.counter)){
                return null;
            }
            else{
                return getRandomCard();
            }
        }
        else {
            return null;
        }
    }

    public Card goToStartCard(){
        if (this.counter == 4) {
        
            if(!(Collections.min(this.locationValue) > this.counter)){
                return null;
            }
        }
        else if (Collections.max(locationValue) == 8){
                return getRandomCard();
            }
            else{
                return getRandomCard();
            }
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
        if (Collections.max(raceLocation.values()) == 8){
            List<Integer> winnerValue = new ArrayList<>();
            for (Integer locationValues : raceLocation.values()){
                if (locationValues == 8){
                    winnerValue.add(locationValues);
                }
            }
            if (winnerValue.size() == 1){
            this.randomTableCard();
            for (Entry<String, Integer> el : this.raceLocation.entrySet()){
                if ( el.getValue() == 8){
                    char firstKey = el.getKey().charAt(0);
                    Card winnerCard = new Card(firstKey, 0);
                    this.returnToStart(winnerCard);
                }
            }
        }
    }
}

    public void getValuesRace(){
        this.counter = 1;
        for (Integer value : raceLocation.values()){
            this.locationValue.add(value);
        }
        if (Collections.min(this.locationValue) >= this.counter){
            this.counter++;
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

    public void returnToStart(Card suit){
        this.suit = goToStartCard().getSuit();

        if (suit.equals('H')) {
            raceLocation.put("Hearts", 0);
            }
        if (suit.equals('C')) {
            raceLocation.put("Clubs", 0);
            }
        if (suit.equals('S')) {
            raceLocation.put("Spades", 0);
            }
        if (suit.equals('D')) {
            raceLocation.put("Diamonds", 0);
            }
    }

}
