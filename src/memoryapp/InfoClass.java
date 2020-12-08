
package memoryapp;

import Memory.Alzheimer;
import Memory.Amnesia;
import Memory.MemoryDeficit;
import java.util.ArrayList;

public class InfoClass{
    
    public static ArrayList<MemoryDeficit> memoryArrayList = new ArrayList<MemoryDeficit>();
    public static int indexesofmemory = 0;
    
    
    /*public static void addMemory(MemoryDeficit def){
        memoryArrayList.add(def);
    }*/
    
    public static int addMemory(MemoryDeficit def){  // I had to change that I couldn't find another way to get only amnesia or alzheimer infos
        memoryArrayList.add(def);
        return indexesofmemory++;    
    }
    
    public static String getAllMemory(){
        String str;
        str = memoryArrayList.toString();
        str = str.replaceAll("[\\[\\]]","");
        str = str.replace(",", "");
        return str;
    }
    
    public static MemoryDeficit searchMemory(String id){ 
        
        MemoryDeficit mem = null;
        
        for (int i = 0; i < MemoryDeficit.getTotalDeficit(); i++){
            
            if(memoryArrayList.get(i).getDeficit_id().compareTo(id) == 0){
                mem = memoryArrayList.get(i);
            }
        }
        return mem;
    }
    
    public static String showTotalMemory(){
        return "\nTotal Deficits: " + MemoryDeficit.getTotalDeficit();
    }
    
    
    // I had to change that I couldn't find another way to get only amnesia or alzheimer infos
    // I CAN WRITE THOSE CODES FOR A SPECIFIC INDEX LIST
    /*public static String getAmnesia(ArrayList<Integer> indexlist){
        String str = "";
        for(int i=0; i < indexlist.size(); i++){
            str += memoryArrayList.get(indexlist.get(i)).toString();          
        }
        str = str.replaceAll("[\\[\\]]","");
        str = str.replace(",", "");
        return str;
    }
    
    public static String getAlzheimer(ArrayList<Integer> indexlist){
        String str = "";
        for(int i=0; i < indexlist.size(); i++){
            str += memoryArrayList.get(indexlist.get(i)).toString();          
        }
        str = str.replaceAll("[\\[\\]]","");
        str = str.replace(",", "");
        return str;
    }*/
    
    public static String getSpecificDeficit(ArrayList<Integer> indexlist){
        String str = "";
        for(int i=0; i < indexlist.size(); i++){
            str += memoryArrayList.get(indexlist.get(i)).toString();          
        }
        str = str.replaceAll("[\\[\\]]","");
        str = str.replace(",", "");
        return str;
    }
}
