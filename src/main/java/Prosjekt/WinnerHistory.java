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
            + " wins\nHearts has: " + winners.get("Hearts") + " wins\nSpades has: " 
            + winners.get("Spades") + " wins\nClubs has: " 
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
         while (scanner.hasNextLine()) {
         String winners = scanner.nextLine();
         System.out.println(winners);
         }
         scanner.close();
     }

    public static void main(String[] args) throws IOException {
        WinnerHistory test = new WinnerHistory();
        HorseGame test1 = new HorseGame();
        HashMap testState = test1.winners;
        test.saveWinners(testState, "src/main/resources/Assets/HorseGameWinners.txt");
        test.printWinners();
    }
}
