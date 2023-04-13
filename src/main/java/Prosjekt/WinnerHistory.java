package Prosjekt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class WinnerHistory {

    HorseGame horseGame = new HorseGame();



    public void saveWinners(HashMap<String, Integer> winners, String file){
        try { 
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(
            "Diamonds has: " + winners.get("Diamonds") 
            + " wins, Hearts has: " + winners.get("Hearts") + " wins, Spades has: " 
            + winners.get("Spades") + " wins, Clubs has: " 
            + winners.get("Clubs") + " wins");
            fileWriter.flush();
            fileWriter.close();
    } catch (IOException e) {
        e.printStackTrace();
        }
    }

     public void printWinners() throws IOException{
         File file = new File("src/main/resources/Assets/HorseGameWinners.txt");
         Scanner scanner = new Scanner(file);
         String winners = scanner.nextLine();
         scanner.close();
         System.out.println(winners);
     }

    public static void main(String[] args) {
        WinnerHistory test = new WinnerHistory();
        HorseGame test1 = new HorseGame();
        HashMap testState = test1.winners;
        test.saveWinners(testState, "src/main/resources/Assets/HorseGameWinners.txt");
    }
}
