import java.util.Arrays;
import java.util.HashMap;

public class Encryption {
    public String encrypt(String message){
        HashMap<String, String> coder = new HashMap<>(); 
        
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}; 
int count = 0; 
StringBuilder ans = new StringBuilder(); 
        for(int i = 0; i< message.length(); i++){
          
            if(!(coder.containsKey(message.substring(i,i+1))))
          {
            coder.put(message.substring(i,i+1), alphabet[count]); 
            count++; 
          }
          ans.append(coder.get(message.substring(i,i+1))); 
        }

        return ans.toString(); 
    }
}
