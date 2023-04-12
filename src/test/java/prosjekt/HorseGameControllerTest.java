package Prosjekt;

import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.matcher.base.NodeMatchers;
import org.testfx.util.WaitForAsyncUtils;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HorseGameControllerTest extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HorseGame.fxml"));
        Parent root = loader.load();
        HorseGameController controller = loader.getController();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Test
    public void testOnNewGameButtonPressed() {
        // Find the "New Game" button
        Button newGameButton = lookup("#newGameButton").query();
        // Click the button
        clickOn(newGameButton);

        // Wait for the game to start
        WaitForAsyncUtils.waitForFxEvents();

        // Check that the horses are in the correct locations
        GridPane gridPane = lookup("#gridPane").query();
        // Check the Diamonds horse is in the first column
        verifyThat(gridPane.getChildren().get(0), NodeMatchers.hasGridPaneColumnIndex(0));
        // Check the Hearts horse is in the second column
        verifyThat(gridPane.getChildren().get(1), NodeMatchers.hasGridPaneColumnIndex(1));
        // Check the Spades horse is in the third column
        verifyThat(gridPane.getChildren().get(2), NodeMatchers.hasGridPaneColumnIndex(2));
        // Check the Clubs horse is in the fourth column
        verifyThat(gridPane.getChildren().get(3), NodeMatchers.hasGridPaneColumnIndex(3));
    }

}

