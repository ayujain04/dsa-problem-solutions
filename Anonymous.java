import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Collections;

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        
        String headline = String.join(" ", headlines); 
        ArrayList<Character> headlineList = new ArrayList<>(); 
    

        for(int i = 0; i<headline.length(); i++){
            headlineList.add(Character.toLowerCase(headline.charAt(i))); 
        }

     



ArrayList<String> answer = new ArrayList<>(); 



        for(String m: messages){
            m = m.replaceAll("\\s","");
            int count = 0; 
            ArrayList<Character> messList = new ArrayList<>(); 
            for(int i = 0; i<m.length(); i++){
                messList.add(Character.toLowerCase(m.charAt(i))); 
            }
            for(int i = 0; i<m.length(); i++){
                if((Collections.frequency(messList, Character.toLowerCase(m.charAt(i))))<=(Collections.frequency(headlineList, Character.toLowerCase(m.charAt(i))))) {
                        count++; 
                }
            }
            if(count == m.length()){
                    answer.add(m); 
            }

        }




          return answer.size();
    }
 }






 