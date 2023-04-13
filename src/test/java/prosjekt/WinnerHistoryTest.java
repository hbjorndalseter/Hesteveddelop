package Prosjekt;

import org.junit.jupiter.api.Test;

public class WinnerHistoryTest {
    @Test
    void testSaveWinnersFilePath() {
        var game = new HorseGame();
        var controller = new HorseGameController();
        var winnerHistory = new WinnerHistory();
        String correctFilePath = "src/main/resources/Assets/HorseGameWinners.txt";
        winnerHistory.saveWinners(game.winners, correctFilePath);
    }
}
