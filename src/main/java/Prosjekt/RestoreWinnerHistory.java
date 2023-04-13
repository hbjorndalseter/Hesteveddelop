package Prosjekt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RestoreWinnerHistory {
    
    public void restoreData(){
        try{ 
            File winnerHistory = new File("src/main/resources/Assets/HorseGameWinners.txt");
            FileReader reader = new FileReader(winnerHistory);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line.toString());
            } 

            bufferedReader.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        RestoreWinnerHistory test = new RestoreWinnerHistory();
        test.restoreData();
    }
}
