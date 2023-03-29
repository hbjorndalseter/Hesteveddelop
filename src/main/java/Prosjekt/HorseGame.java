package Prosjekt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HorseGame extends CardDeck implements HorseInterface {

    HashMap<String, Integer> winners;
    private int lengthOfGame;
    List<Integer> raceLocation;
    List<String> users;
    

    public HorseGame(){

        super(52);

        this.winners = new HashMap<String, Integer>();
        this.lengthOfGame = 10;
        this.raceLocation = new ArrayList<>();
        this.users = new ArrayList<>();

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

}
