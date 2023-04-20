package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Save {
    //money, level, exp
    static HashMap<String, String> saveData = new HashMap<String, String>();
    static ArrayList<String> lineList = new ArrayList<String>();

    private static File file = new File("../data/save/Save.txt");
    // saveData.put("this","isthis");
    
    private static void load(){
        Save.saveData.clear();
        Save.lineList.clear();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Save.lineList.add(line);
            }
            for(String s : Save.lineList){
                System.out.println(s);
            }
            System.out.println("");
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(String str : Save.lineList){
            String[] arrOfStr = str.split(":", 2);
            saveData.put(arrOfStr[0],arrOfStr[1]);
        }

        System.out.println(Save.saveData.get("money"));
        System.out.println(Save.saveData.get("level"));
        System.out.println(Save.saveData.get("exp"));

        
    }

    
}
