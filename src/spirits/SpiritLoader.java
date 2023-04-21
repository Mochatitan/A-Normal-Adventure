package spirits;

public class SpiritLoader{

    HashMap<String, String> dataList = new HashMap<String, String>();
    ArrayList<String> lineList = new ArrayList<String>();
    
    private File file = new File("../data/spirits/Save.txt");
    // saveData.put("this","isthis");
    public static void save(){
        
    }
    public static void load(){
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
