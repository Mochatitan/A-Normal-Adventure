package engine;

public class TxtFile{ 
    private File file;
    public TxtFile(String filePath){
         file = new File("../data/save/Save.txt");
    }
    
    public void push(HashMap<String, String> hashmap){
        //TODO 
    }
    public HashMap<String, String> load(){
        HashMap<String, String> saveData = new HashMap<String, String>();
        ArrayList<String> lineList = new ArrayList<String>(); 
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineList.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(String str : lineList){
            String[] arrOfStr = str.split(":", 2);
            saveData.put(arrOfStr[0],arrOfStr[1]);
        }
        return saveData;
    }
}
