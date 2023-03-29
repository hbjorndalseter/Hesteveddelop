package Prosjekt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HorseGame extends CardDeck implements HorseInterface {

    HashMap<String, Integer> winners;
    private int lengthOfGame;
    public HashMap<String, Integer> raceLocation; 
    List<String> users;
    Card suit;
    int counter;
    

    public HorseGame(){

        super(52);

        this.winners = new HashMap<String, Integer>();
        this.lengthOfGame = 10;
        this.raceLocation = new HashMap<String, Integer>();
        this.users = new ArrayList<>();

        raceLocation.put("Hearts", 0);
        raceLocation.put("Clubs", 0);
        raceLocation.put("Spades", 0);
        raceLocation.put("Diamonds", 0);

    }

    @Override
    public void newGame(String...userNames) {
        if(userNames.length <= 5){
            return;
        }
        else{
            for (String userName : userNames){
                this.createUsername(userName);
            }
            this.runGame();
        }
    }

    @Override
    public void runGame() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'runGame'");
    }

    @Override
    public void addWinner() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addWinner'");
    }

    @Override
    public void createUsername(String userName) {
        if(!(userName.matches("[a-zA-Z]+"))){
            for (String user : users){
                if(user.equalsIgnoreCase(userName))
            throw new IllegalArgumentException("Username can only consist of letters, or the username already exists");
            }
        }
        else{this.users.add(userName);
        }
    }

    public Card pickRandomCard(){
        return getRandomCard();
    }
    
    public Card randomTableCard(){
        return getRandomCard();
    }

    @Override
    public void endGame() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'endGame'");
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

public void getValuesRace(){
    this.counter = 1;
    List<Integer> locationValue = new ArrayList<>();
    for (Integer value : raceLocation.values()){
        locationValue.add(value);
    }
    if (Collections.min(locationValue) >= this.counter){
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

}
