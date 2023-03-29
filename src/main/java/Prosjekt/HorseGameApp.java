package Prosjekt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HorseGameApp extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Horse Game App");
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("HorseApp.fxml"))));
        primaryStage.show();
    }

}
