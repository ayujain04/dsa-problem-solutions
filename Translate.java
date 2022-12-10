import java.util.HashMap;
import java.util.HashSet;

public class Translate {
    public int numAlternates(String original, String translated) {
        HashMap<String, HashSet<String>> map = new HashMap<>();
        String[] org = original.split(" ");
        String[] trans = translated.split(" ");

        for(int i = 0; i<org.length; i++){
            if(!map.containsKey(org[i])){
                map.put(org[i], new HashSet());
            }
            map.get(org[i]).add(trans[i]);
        }

        int ans = 0; 
        for(String p: map.keySet()){
            if(map.get(p).size()>1){
                ans+=map.get(p).size();
            }
        }
        
        return ans; 
    }
}
