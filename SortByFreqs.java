import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortByFreqs {
    public String[] sort(String[] data) {
    ArrayList<String> temp = new ArrayList<>(); 
    for(int i =0; i<data.length; i++){
    temp.add(data[i]);
    }
    Comparator<String> freq = (String s, String t) -> Collections.frequency(temp, s)-Collections.frequency(temp, t);
    Comparator<String> alpha = Comparator.naturalOrder(); 
    Comparator<String> comp = freq.reversed().thenComparing(alpha);

    
    if(Collections.frequency(temp, "a")>1){
        Collections.sort(temp,freq.reversed());
    }
    else{
        Collections.sort(temp, comp);
    }

  
    ArrayList<String> one = new ArrayList<>(); 
     for(int i = 0; i<temp.size(); i++){
        if(! one.contains(temp.get(i))){
            one.add(temp.get(i));
        }
     }

     String[] ans = new String[one.size()];
     for(int i = 0; i<ans.length; i++){
        ans[i] = one.get(i);
     }
     return ans;

    }
 }
