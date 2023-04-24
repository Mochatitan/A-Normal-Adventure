package engine;

public class TxtFile{ 
    public TxtFile(String filePath){
         String directory = filePath;
    }
    
    public void push(HashMap<String, String> hashmap){
        //TODO 
    }
    
    public HashMap<String, String> load(String fileName){ 
        File file = new File(directory+"/"+fileName);
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
