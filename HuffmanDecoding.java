import java.util.HashMap;

public class HuffmanDecoding {
    public String decode(String archive, String[] dictionary) {
        
        HashMap<String, Character> map = new HashMap<>(); 
        char c = 'A'; 
        for(String s: dictionary){
            map.put(s, c); 
            c += 1; 
        }

        String ans = ""; 
        int start = 0; 
        for(int i = start; i<=archive.length(); i++){
            if(map.containsKey(archive.substring(start, i))){
                ans +=map.get(archive.substring(start,i)); 
                start = i; 
            }
        }
        return ans; 
    }
 }