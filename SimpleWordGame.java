import java.util.Arrays;
import java.util.HashSet;
public class SimpleWordGame {
    public int points(String[] player, 
                      String[] dictionary) {

        HashSet<String> playerFixed = new HashSet<>(Arrays.asList(player)); 
//This above makes playerFixed, a hashset that has player but with no duplicates
       int ret = 0; 
for (String answer: playerFixed){
            for (int z =0; z<dictionary.length; z++ )
            {
                if (answer.equals(dictionary[z]))
                {
                    ret += answer.length()*answer.length(); 
                }

            }
       }
        
        return ret; 
    }
}
