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
    ImageView pokemonCardFirst;
    ImageView pokemonCardSecond;
    ImageView pokemonCardThird;
    ImageView pokemonCardFourth;
    ImageView pokemonCardFifth;
    ImageView pokemonCardSixth;
    ImageView pokemonCardSeventh;
    ImageView pokemonCardEight;

    public HorseGameController() {
        HashMap<String, Integer> raceLocation = new HashMap<String, Integer>();
        this.game = new HorseGame();
        this.gridPane = new GridPane();
        this.Diamonds= new ImageView("@../../../../../../Skjermbilde%202023-03-30%20kl.%2010.15.05.png");
        this.Hearts = new ImageView("@../../../../../../Skjermbilde%202023-03-30%20kl.%2010.15.00.png");
        this.Spades = new ImageView("@../../../../../../Skjermbilde%202023-03-30%20kl.%2010.14.41.png");
        this.Clubs = new ImageView("@../../../../../../Skjermbilde%202023-03-30%20kl.%2010.13.54.png");
        this.pokemonCardFirst = new ImageView("@../../../../../../Skjermbilde%202023-03-30%20kl.%2011.20.06.png");
        this.pokemonCardSecond = new ImageView("@../../../../../../Skjermbilde%202023-03-30%20kl.%2011.20.06.png");
        this.pokemonCardThird = new ImageView("@../../../../../../Skjermbilde%202023-03-30%20kl.%2011.20.06.png");
        this.pokemonCardFourth = new ImageView("@../../../../../../Skjermbilde%202023-03-30%20kl.%2011.20.06.png");
        this.pokemonCardFifth = new ImageView("@../../../../../../Skjermbilde%202023-03-30%20kl.%2011.20.06.png");
        this.pokemonCardSixth = new ImageView("@../../../../../../Skjermbilde%202023-03-30%20kl.%2011.20.06.png");
        this.pokemonCardSeventh = new ImageView("@../../../../../../Skjermbilde%202023-03-30%20kl.%2011.20.06.png");
        this.pokemonCardEight = new ImageView("@../../../../../../Skjermbilde%202023-03-30%20kl.%2011.20.06.png");
        gridPane.getChildren().add(pokemonCardFirst);
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
        
        GridPane.setColumnIndex(pokemonCardFirst, 2);
        GridPane.setColumnIndex(pokemonCardSecond, 2);
        GridPane.setColumnIndex(pokemonCardThird, 2);
        GridPane.setColumnIndex(pokemonCardFourth, 2);
        GridPane.setColumnIndex(pokemonCardFifth, 2);
        GridPane.setColumnIndex(pokemonCardSixth, 2);
        GridPane.setColumnIndex(pokemonCardSeventh, 2);
        GridPane.setColumnIndex(pokemonCardEight, 2);

        GridPane.setRowIndex(pokemonCardFirst, 2);
        GridPane.setRowIndex(pokemonCardSecond, 3);
        GridPane.setRowIndex(pokemonCardThird, 4);
        GridPane.setRowIndex(pokemonCardFourth, 5);
        GridPane.setRowIndex(pokemonCardFifth, 6);
        GridPane.setRowIndex(pokemonCardSixth, 7);
        GridPane.setRowIndex(pokemonCardSeventh, 8);
        GridPane.setRowIndex(pokemonCardEight, 9);

    }

}
