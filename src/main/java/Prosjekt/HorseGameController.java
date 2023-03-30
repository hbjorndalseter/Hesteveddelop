package Prosjekt;

import java.util.ArrayList;
import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HorseGameController {
    
    public HashMap<String, Integer> raceLocation; 
    private ArrayList<Card> cards;
    private Object suit;

    @FXML
    private Button newGameButton;

    @FXML
    private Button newCardButton;

    public HorseGameController() {
        HashMap<String, Integer> raceLocation = new HashMap<String, Integer>();
        
    }

    @FXML
    private void OnNewGameButtonPressed(ActionEvent event) {
        System.out.println(newGameButton.getText());
    }

    @FXML
    private void OnNewCardButtonPressed(ActionEvent event) {
        
    }
    

    




}
