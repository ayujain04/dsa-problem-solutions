import java.util.ArrayList;
public class Starter {
    public int begins(String[] words, String first) {
        ArrayList<String> singles = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i<words.length; i++){
            if(!singles.contains(words[i])){
                if (words[i].substring(0,1).equals(first)){
                    singles.add(words[i]); 
                    sum++; 
                }
             
            }
        }
        return sum;
    }
}
