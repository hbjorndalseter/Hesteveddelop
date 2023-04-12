package Prosjekt;
/* 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class WinnerHistory implements HorseInterface{

    // HashMap<String, Integer> winners = new HashMap<>();

    HorseGame horseGame = new HorseGame();

    @Override
    public void addWinner() {
        horseGame.addWinner();
    }

    private void saveWinners(){
        try { 
            FileWriter fileWriter = new FileWriter("HorseGameWinner.txt");
            fileWriter.write(
            "Diamonds has: " + horseGame.winners.get("Diamonds") 
            + " wins, Hearts has: " + horseGame.winners.get("Hearts") + "wins, Spades has: " 
            + horseGame.winners.get("Spades") + "wins, Clubs has: " 
            + horseGame.winners.get("Clubs") + "wins");
            fileWriter.close();
    } catch (IOException e) {
        e.printStackTrace();
        }
    }

    private void printWinners(){
        try {
            File file = new File("Assets/HorseGameWinners.txt");
            Scanner scanner = new Scanner("Assets/HorseGameWinners.txt");
            String winners = scanner.nextLine();
            scanner.close();
            System.out.println(winners);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
*/