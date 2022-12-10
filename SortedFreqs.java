import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;; 
public class SortedFreqs {
    public int[] freqs(String[] data) {
        ArrayList<String> temp = new ArrayList<>(); 
        TreeSet<String> tempSet = new TreeSet<>(); 
        for(String s: data){
            temp.add(s);
            tempSet.add(s);
        }
        ArrayList<Integer> ansTemp = new ArrayList<>(); 
        for(String s: tempSet){
            ansTemp.add(Collections.frequency(temp, s));
        }
        int[] ans = new int[ansTemp.size()];
        for(int i = 0; i<ans.length; i++){
            ans[i] = ansTemp.get(i);
        }
        return ans; 


    }
 }
