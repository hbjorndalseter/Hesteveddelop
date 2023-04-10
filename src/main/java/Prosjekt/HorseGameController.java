package Prosjekt;

import java.util.ArrayList;
import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class HorseGameController {
    
    public HashMap<String, Integer> raceLocation; 
    private ArrayList<Card> cards;
    private Object suit;

    @FXML
    private Button newGameButton;

    @FXML
    private Button newCardButton;

    HorseGame game;
    GridPane gridPane;
    ImageView Diamonds;
    ImageView Hearts;
    ImageView Spades;
    ImageView Clubs;

    public HorseGameController() {
        HashMap<String, Integer> raceLocation = new HashMap<String, Integer>();
        this.game = new HorseGame();
        this.gridPane = new GridPane();
        this.Diamonds= new ImageView("@../../../../../../Skjermbilde%202023-03-30%20kl.%2010.15.05.png");
        this.Hearts = new ImageView("@../../../../../../Skjermbilde%202023-03-30%20kl.%2010.15.00.png");
        this.Spades = new ImageView("@../../../../../../Skjermbilde%202023-03-30%20kl.%2010.14.41.png");
        this.Clubs = new ImageView("@../../../../../../Skjermbilde%202023-03-30%20kl.%2010.13.54.png");
        gridPane.getChildren().add(Diamonds);
        gridPane.getChildren().add(Hearts);
        gridPane.getChildren().add(Spades);
        gridPane.getChildren().add(Clubs);

        
        
    }

    @FXML
    private void OnNewGameButtonPressed(ActionEvent event) {
        System.out.println(newGameButton.getText());
        

    }

    @FXML
    private void OnNewCardButtonPressed(ActionEvent event) {
        ///game.pickRandomCard();
        System.out.println(game.pickRandomCard());
}
    @FXML 
    private void setStartPos(){
        GridPane.setColumnIndex(Diamonds, 1);
        GridPane.setColumnIndex(Hearts, 1);
        GridPane.setColumnIndex(Spades, 1);
        GridPane.setColumnIndex(Clubs, 1);
        GridPane.setRowIndex(Diamonds, 1);
        GridPane.setRowIndex(Hearts, 2);
        GridPane.setRowIndex(Spades, 3);
        GridPane.setRowIndex(Clubs, 4);
    }

}
