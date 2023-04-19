package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

public class Save {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("this","isthis");
    public void test(){
        File file = new File("../data/save/Money.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
