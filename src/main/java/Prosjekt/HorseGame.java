package Prosjekt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HorseGame implements HorseInterface{

    HashMap<String, Integer> winners;
    private int lengthOfGame;
    List<Integer> raceLocation;
    List<String> users;

    public HorseGame(){

        this.winners = new HashMap<String, Integer>();
        this.lengthOfGame = 10;
        this.raceLocation = new ArrayList<>();
        this.users = new ArrayList<>();



    }

    @Override
    public void newGame() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'newGame'");
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
            throw new IllegalArgumentException("Username can only cinsist of letters");
        }
        else{this.users.add(userName);
        }
    }
    
}
