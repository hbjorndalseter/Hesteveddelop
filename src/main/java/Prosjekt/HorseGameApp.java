package Prosjekt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class HorseGameApp extends Application {

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

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Horse Game App");
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("HorseApp.fxml"))));

        GridPane gridPane = new GridPane();
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
    
        // gridPane.getChildren().add(new ImageView(Diamonds));
        // ImageView diamonds = new ImageView(Diamonds);
        // ImageView hearts = new ImageView(Hearts);
        // ImageView spades = new ImageView(Spades);
        // ImageView clubs = new ImageView(Clubs);
        // gridPane.add(diamonds, 0, 0);
        // gridPane.add(hearts, 1, 1);
        // gridPane.add(spades, 1, 2);
        // gridPane.add(clubs, 1, 3); 

        primaryStage.show();
    }

}
