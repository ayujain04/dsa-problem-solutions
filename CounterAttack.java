import java.util.Arrays;
import java.util.Collections;

public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        // change this code

        String[] strArr = str.split(" "); 
        int[] answer = new int[words.length]; 

        for(int i = 0; i <words.length; i++){

            answer[i] = Collections.frequency(Arrays.asList(strArr),words[i]);
            
        }

        return answer;
    }
}

