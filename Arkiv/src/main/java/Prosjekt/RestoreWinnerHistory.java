package Prosjekt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RestoreWinnerHistory {

    List<Integer> currentWinnerValues = new ArrayList<>();
    
    public void restoreData(){
        try{ 
            File winnerHistory = new File("src/main/resources/Assets/HorseGameWinners.txt");
            FileReader reader = new FileReader(winnerHistory);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null){
                String[] splitText = line.split(" ");
                if (splitText.length > 2) {
                    String winnerValue = splitText[2];
                    this.currentWinnerValues.add(Integer.valueOf(winnerValue));
                    System.out.println(winnerValue);
                }
            } 

            bufferedReader.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
    }
}
