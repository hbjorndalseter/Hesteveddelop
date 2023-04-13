package Prosjekt;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class HorseGameController {
    
    public HashMap<String, Integer> raceLocation; 

    @FXML   
    public Button newCardButton;

    @FXML
    private GridPane gridPane;

    @FXML
    private Label myLabel;

    @FXML
    private Label hvemVinner;

    @FXML
    private Label highScore;

    HorseGame game;

    private Image Diamonds;
    private Image Hearts;
    private Image Spades;
    private Image Clubs;
 
    Image Pokemon;

    ImageView diamonds;
    ImageView hearts;
    ImageView clubs;
    ImageView spades;

    private Card currentRandCard;

    private List<Integer> locationValue;

    private WinnerHistory winnerHistory;
    
    @FXML
    private void initialize() {

        this.game = new HorseGame();
        this.winnerHistory = new WinnerHistory();

        this.Diamonds= new Image("Assets/Diamonds.png");
        this.Hearts = new Image("Assets/Hearts.png");
        this.Spades = new Image("Assets/Spades.png");
        this.Clubs = new Image("Assets/Clubs.png");
        this.Pokemon = new Image("Assets/Pokemon.png");
      
        this.diamonds = new ImageView(Diamonds);
        this.hearts = new ImageView(Hearts);
        this.spades = new ImageView(Spades);
        this.clubs = new ImageView(Clubs);

        ImageView pokemonCardFirst = new ImageView(Pokemon);
        ImageView pokemonCardSecond = new ImageView(Pokemon);
        ImageView pokemonCardThird = new ImageView(Pokemon);
        ImageView pokemonCardFourth = new ImageView(Pokemon);
        ImageView pokemonCardFifth = new ImageView(Pokemon);
        ImageView pokemonCardSixth = new ImageView(Pokemon);
        ImageView pokemonCardSeventh = new ImageView(Pokemon);
        ImageView pokemonCardEight = new ImageView(Pokemon);

        pokemonCardFirst.setFitHeight(100);
        pokemonCardFirst.setFitWidth(60);
        pokemonCardSecond.setFitHeight(100);
        pokemonCardSecond.setFitWidth(60);
        pokemonCardThird.setFitHeight(100);
        pokemonCardThird.setFitWidth(60);
        pokemonCardFourth.setFitHeight(100);
        pokemonCardFourth.setFitWidth(60);
        pokemonCardFifth.setFitHeight(100);
        pokemonCardFifth.setFitWidth(60);
        pokemonCardSixth.setFitHeight(100);
        pokemonCardSixth.setFitWidth(60);
        pokemonCardSeventh.setFitHeight(100);
        pokemonCardSeventh.setFitWidth(60);
        pokemonCardEight.setFitHeight(100);
        pokemonCardEight.setFitWidth(60);

        gridPane.add(diamonds, game.raceLocation.get("Diamonds"), 0);
        gridPane.add(hearts, game.raceLocation.get("Hearts"), 1);
        gridPane.add(spades, game.raceLocation.get("Spades"), 2);
        gridPane.add(clubs, game.raceLocation.get("Clubs"), 3); 
        gridPane.add(pokemonCardFirst, 1, 5);
        gridPane.add(pokemonCardSecond, 2, 5);
        gridPane.add(pokemonCardThird, 3, 5);
        gridPane.add(pokemonCardFourth, 4, 5);
        gridPane.add(pokemonCardFifth, 5, 5);
        gridPane.add(pokemonCardSixth, 6, 5);
        gridPane.add(pokemonCardSeventh, 7, 5);
        gridPane.add(pokemonCardEight, 8, 5);
    
    }

    private void changeState(){
        System.out.println(game.raceLocation.get("Diamonds"));
        System.out.println(game.raceLocation.get("Hearts"));
        System.out.println(game.raceLocation.get("Clubs"));
        System.out.println(game.raceLocation.get("Spades"));
        GridPane.setColumnIndex(diamonds, game.raceLocation.get("Diamonds"));
        GridPane.setColumnIndex(hearts, game.raceLocation.get("Hearts"));
        GridPane.setColumnIndex(clubs, game.raceLocation.get("Clubs"));
        GridPane.setColumnIndex(spades, game.raceLocation.get("Spades"));
    }

    @FXML
    private void OnNewCardButtonPressed(ActionEvent event) throws IOException {
        moveHorse();
        showCard();
        game.winnerKey();
        if (game.winnerIsSet) {
           VinnerenEr();
           game.addWinner();
           winnerHistory.saveWinners(game.winners, "src/main/resources/Assets/HorseGameWinners.txt");
           winnerHistory.printWinners();
           newCardButton.setDisable(true);
           File file = new File("src/main/resources/Assets/HorseGameWinners.txt");
           Scanner scanner = new Scanner(file);
           String allWinners = " ";
           while (scanner.hasNextLine()) {
            String winners = scanner.nextLine();
            allWinners += "\n" + winners;
           }
           scanner.close();
           highScore.setText(allWinners);
        }
    }
    
    public void moveHorse() {
        this.currentRandCard = game.pickRandomCard();
        //if(game.randomTableCard() != null){
        //Card currentTableCard = game.randomTableCard();
        //game.goBackwards(currentTableCard);
        //}
        System.out.println(game.pickRandomCard());
        game.goForward(currentRandCard);
        // game.goBackwards(currentTableCard);
        //game.goToStartCard();
        this.changeState(); 
    }

    public void showCard() {
        myLabel.setText(this.currentRandCard.toString());
    }

    private void VinnerenEr() {
        hvemVinner.setText("Vinneren er  " + game.winnerKey + ", og vinnerne MÅ chugge 0.5L pils! ");
    }
}
