package spirits;
import java.io.File;
// Import Jackson json databind/core
//Import HashMap
//Import Spirit class

public class SpiritLoader{
     HashMap<String, Spirit> spirits = new HashMap
     // Unsure exactly how you want this handled, but as a proof of concept and a good starting point
     // I am going to just create of array of all available Spirits dymaically based on availble json files
     ObjectMapper objectMapper = new ObjectMapper();

     File dir = new File("objects/spirits/");
     File[] directoryListing = dir.listFiles();

     publc void loadSpirits(){

          if(directoryListing != null) {
               for(File child : directoryListing) {
                    Spirit spirit = objectMapper.readValue(child, Spirit.class);
                    spirits.put(spirit.getName(), spirit);
               }
          }
     }



}
