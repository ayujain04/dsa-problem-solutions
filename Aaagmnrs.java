import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap; 

public class Aaagmnrs {
    public String[] anagrams(String[] phrases) {

        HashMap<String, ArrayList<String>>  map = new HashMap<>();
        ArrayList<String> answer = new ArrayList<>();  
        for(String s: phrases){
            String[] temp = s.split(" ");
            String sNew = String.join("",temp);
            ArrayList<String> list = new ArrayList<>(); 
            char[] s1 = sNew.toLowerCase().toCharArray();
            Arrays.sort(s1);
            if(!map.containsKey(String.valueOf(s1).toLowerCase())){
                map.put(String.valueOf(s1).toLowerCase(), list); 
                answer.add(s); 
            }
            map.get(String.valueOf(s1).toLowerCase()).add(s); 
        }
        String[] ans = new String[answer.size()]; 
        for(int i = 0; i< answer.size(); i++){
            ans[i] = answer.get(i);
        }
        return ans; 


    }

  
 }