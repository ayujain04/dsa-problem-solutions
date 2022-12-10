import java.util.HashSet;
import java.util.ArrayList;


public class TxMsg {

  
 
  
  /**
   * @param original
   * @return
   */
  public String getMessage(String original) {

    
      /*
       * Cases: 
       * 1: Word is composed of ONLY Vowels so the whole message is returned (only vowels now works yay!)
       * 2: If word has a consonent: 
       *          Write only the consonents that don't have another consonent immeadiately before them. 
       *          Write no vowels
       * 
       * 
       */

       String[] originalArr = original.split(" ");
       String[] newArr = new String[originalArr.length];       

       for(int i = 0; i< originalArr.length; i++){
        if (isAllVowels(originalArr[i])){
          newArr[i] = originalArr[i];
        }
       else{
         char[] arr = originalArr[i].toCharArray();
         String result = "";
         if(!(isVowel(arr[0]))){
          result += arr[0];
         }
    
         for(int z = 1; z<arr.length; z++){
            if (!(isVowel(arr[z])) && (isVowel(arr[z-1]))){
              result += arr[z];
            }
         }
         newArr[i] = result;
       }

        }
          //The isAllVowels works but the else statement is failing me
      
       String answer = String.join(" ", newArr);
       return answer;
    }

    public boolean isVowel(char c){
      HashSet<Character> vowels = new HashSet<Character>(); 
      vowels.add('a');
      vowels.add('e');
      vowels.add('i');
      vowels.add('o');
      vowels.add('u');

      if(vowels.contains(c)){
        return true;
      }
      else{
        return false; 


      }

    }

  

    public boolean isAllVowels(String something){
      HashSet<Character> vowels = new HashSet<Character>(); 
      vowels.add('a');
      vowels.add('e');
      vowels.add('i');
      vowels.add('o');
      vowels.add('u');
      char[] arr = something.toCharArray(); 
      int count = 0; 
      int goal = arr.length;
      for(char s: arr){
        if((vowels.contains(s))){
          count++; 
        }
      }
    if(count==goal){
      return true; 
    }
return false;
    }
 }
