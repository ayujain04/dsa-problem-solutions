import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class LunchPlans {
    public String[] favorites(String[] preferences) {
        HashMap<String, Integer> map = new HashMap<>(); 
        TreeSet<String> sir = new TreeSet<>(); 
        for(String s: preferences){
            String[] stringArr = s.split(" ");
                for(String k: stringArr){
                    if(!map.containsKey(k)){
                        map.put(k, 0); 
                    }
                    map.put(k, map.get(k)+1); 
                }
        }
        for(String kar: map.keySet()){
            if(map.get(kar)==preferences.length){
                sir.add(kar);
            }
        }

        
        

    String[] t = preferences[0].split(" ");
    ArrayList<String> temp = new ArrayList<>(); 
    for(int z = 0; z<t.length; z++){
        temp.add(t[z]);
        if(!sir.contains(t[z])){
            temp.remove(t[z]);
        }
    }
    String[] ans = new String[temp.size()];
    for(int i= 0; i<ans.length; i++){
        ans[i] = temp.get(i);
    }
        return ans; 

    
     

       

        

    }
}