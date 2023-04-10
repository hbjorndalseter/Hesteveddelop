package Prosjekt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javafx.scene.layout.GridPane;

public class HorseGame extends CardDeck implements HorseInterface {

    HashMap<String, Integer> winners;
    public HashMap<String, Integer> raceLocation; 
    List<String> users;
    char suit;
    int counter;
    List<Integer> locationValue;
    String winnerKey;
    boolean winnerIsSet;
    GridPane gridPane;
    

    public HorseGame(){

        super(13);

        this.winners = new HashMap<String, Integer>();
        this.raceLocation = new HashMap<String, Integer>();
        this.users = new ArrayList<>();
        this.locationValue = new ArrayList<>();
        this.winnerIsSet = false;
        this.gridPane = new GridPane();

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
       HorseGame game = new HorseGame();
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

    public void winnerKey(){
        for(Entry<String, Integer> entry: raceLocation.entrySet()) {
    
            if(entry.getValue() == 9) {
              this.winnerKey = entry.getKey();
              this.winnerIsSet = true;
              break;
            }
          }
        }

     @Override
    public String endGame() {
        if (Collections.max(this.raceLocation.values()) == 9 && this.winnerIsSet == true){
            return this.winnerKey;
        }
        else{
            return null;
        }
    }

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
        boolean hjalmarogvegard = true;
        if (this.counter == 4) {
        
            if(!(Collections.min(this.locationValue) > this.counter)){
                return null;
            }
            else{
                return getRandomCard();
            }
        }
        else if (Collections.max(locationValue) == 8 && hjalmarogvegard == true) {
                hjalmarogvegard = false;
                return getRandomCard();
            }
        else {
            return null;
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
    public static void main(String[] args) {
        HorseGame test1 = new HorseGame();
        Card randomCard = test1.getRandomCard();
        System.out.println(randomCard);
        test1.winnerKey();
        System.out.println(test1.endGame());
        System.out.println(test1.getCardDeck());        
    }

}
