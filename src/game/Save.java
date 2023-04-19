package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Save {
    //money, level, exp
    HashMap<String, String> saveData = new HashMap<String, String>();
    ArrayList<String> lineList = new ArrayList<String>();

    // saveData.put("this","isthis");
    
    public void test(){
        File file = new File("/workspaces/A-Normal-Adventure/data/save/Save.txt");
        
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineList.add(line);
            }
            for(String s : lineList){
                System.out.println(s);
            }
            System.out.println("");
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(String str : lineList){
            String[] arrOfStr = str.split(":", 2);
            saveData.put(arrOfStr[0],arrOfStr[1]);
        }

        System.out.println(saveData.get("money"));
        System.out.println(saveData.get("level"));
        System.out.println(saveData.get("exp"));
    }
}
