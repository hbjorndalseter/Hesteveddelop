package Prosjekt;

import java.util.ArrayList;
import java.util.HashMap;

//import javax.swing.Action;

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

    @FXML
    private GridPane gridPane;

    HorseGame game;
    //GridPane gridPane;
    Image Diamonds;
    Image Hearts;
    Image Spades;
    Image Clubs;
    Image pokemonCardFirst;
    Image pokemonCardSecond;
    Image pokemonCardThird;
    Image pokemonCardFourth;
    Image pokemonCardFifth;
    Image pokemonCardSixth;
    Image pokemonCardSeventh;
    Image pokemonCardEight;
    
    @FXML
    private void initialize() {
        HashMap<String, Integer> raceLocation = new HashMap<String, Integer>();
        this.game = new HorseGame();
        this.Diamonds= new Image("Assets/Diamonds.png");
        this.Hearts = new Image("Assets/Hearts.png");
        this.Spades = new Image("Assets/Spades.png");
        this.Clubs = new Image("Assets/Clubs.png");
        this.pokemonCardFirst = new Image("Assets/Pokemon.png");
        this.pokemonCardSecond = new Image("Assets/Pokemon.png");
        this.pokemonCardThird = new Image("Assets/Pokemon.png");
        this.pokemonCardFourth = new Image("Assets/Pokemon.png");
        this.pokemonCardFifth = new Image("Assets/Pokemon.png");
        this.pokemonCardSixth = new Image("Assets/Pokemon.png");
        this.pokemonCardSeventh = new Image("Assets/Pokemon.png");
        this.pokemonCardEight = new Image("Assets/Pokemon.png");
    
        //gridPane.getChildren().add(new ImageView(Diamonds));
        ImageView diamonds = new ImageView(Diamonds);
        ImageView hearts = new ImageView(Hearts);
        ImageView spades = new ImageView(Spades);
        ImageView clubs = new ImageView(Clubs);
        gridPane.add(diamonds, 1, 0);
        gridPane.add(hearts, 1, 1);
        gridPane.add(spades, 1, 2);
        gridPane.add(clubs, 1, 3); 


        


        // gridPane.getChildren().add(pokemonCardFirst);
        // gridPane.getChildren().add(Diamonds);
        // gridPane.getChildren().add(Hearts);
        // gridPane.getChildren().add(Spades);
        // gridPane.getChildren().add(Clubs);

        
        
    }

    @FXML
    private void OnSetUpGamePressed(ActionEvent event){
        // GridPane gridPane = new GridPane();
        // this.Diamonds= new Image("Assets/Diamonds.png");
        // this.Hearts = new Image("Assets/Hearts.png");
        // this.Spades = new Image("Assets/Spades.png");
        // this.Clubs = new Image("Assets/Clubs.png");
        // this.pokemonCardFirst = new Image("Assets/Pokemon.png");
        // this.pokemonCardSecond = new Image("Assets/Pokemon.png");
        // this.pokemonCardThird = new Image("Assets/Pokemon.png");
        // this.pokemonCardFourth = new Image("Assets/Pokemon.png");
        // this.pokemonCardFifth = new Image("Assets/Pokemon.png");
        // this.pokemonCardSixth = new Image("Assets/Pokemon.png");
        // this.pokemonCardSeventh = new Image("Assets/Pokemon.png");
        // this.pokemonCardEight = new Image("Assets/Pokemon.png");
    
        // gridPane.getChildren().add(new ImageView(Diamonds));
        // ImageView diamonds = new ImageView(Diamonds);
        // ImageView hearts = new ImageView(Hearts);
        // ImageView spades = new ImageView(Spades);
        // ImageView clubs = new ImageView(Clubs);
        // gridPane.add(diamonds, 0, 0);
        // gridPane.add(hearts, 1, 1);
        // gridPane.add(spades, 1, 2);
        // gridPane.add(clubs, 1, 3);
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
    // @FXML 
    // private void setStartPos(){
    //     GridPane.setColumnIndex(diamonds, 1);
    //     GridPane.setColumnIndex(Hearts, 1);
    //     GridPane.setColumnIndex(Spades, 1);
    //     GridPane.setColumnIndex(Clubs, 1);

    //     GridPane.setRowIndex(Diamonds, 1);
    //     GridPane.setRowIndex(Hearts, 2);
    //     GridPane.setRowIndex(Spades, 3);
    //     GridPane.setRowIndex(Clubs, 4);
        
    //     GridPane.setColumnIndex(pokemonCardFirst, 2);
    //     GridPane.setColumnIndex(pokemonCardSecond, 2);
    //     GridPane.setColumnIndex(pokemonCardThird, 2);
    //     GridPane.setColumnIndex(pokemonCardFourth, 2);
    //     GridPane.setColumnIndex(pokemonCardFifth, 2);
    //     GridPane.setColumnIndex(pokemonCardSixth, 2);
    //     GridPane.setColumnIndex(pokemonCardSeventh, 2);
    //     GridPane.setColumnIndex(pokemonCardEight, 2);

    //     GridPane.setRowIndex(pokemonCardFirst, 2);
    //     GridPane.setRowIndex(pokemonCardSecond, 3);
    //     GridPane.setRowIndex(pokemonCardThird, 4);
    //     GridPane.setRowIndex(pokemonCardFourth, 5);
    //     GridPane.setRowIndex(pokemonCardFifth, 6);
    //     GridPane.setRowIndex(pokemonCardSixth, 7);
    //     GridPane.setRowIndex(pokemonCardSeventh, 8);
    //     GridPane.setRowIndex(pokemonCardEight, 9);

    // }

}
