import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.HashMap; 

public class SetAside {
    public String common(String[] list) {
        int check = list.length; 

        int count = 0; 
        StringBuilder ans = new StringBuilder(); 
        ArrayList<String> answer = new ArrayList<String>(); 
        ArrayList<String> total = new ArrayList<>(); 
        for(String s:list){
            HashSet<String> words = new HashSet<>(); 
            words.addAll(Arrays.asList(s.split(" ")));
            total.addAll(words);
        }

        TreeSet<String> answer1 = new TreeSet<>(); 
        for(String p: total){
            
            if(Collections.frequency(total, p)==list.length){

                answer1.add(p);
            }

        }

        for(String z: answer1){
            ans.append(z);
            ans.append(" ");
        }
        if(ans.length()>0){
            ans.delete(ans.length()-1, ans.length()); 
        }
        return ans.toString();
    }
}
