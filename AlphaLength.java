import java.util.TreeSet;
import java.util.Arrays; 


public class AlphaLength {
    public ListNode create (String[] words) {

        TreeSet<String> temp = new TreeSet<>();

        for(String s: words){
            temp.add(s); 
        }

   

  String [] clean = temp.toArray(new String[0]);

  ListNode ans = new ListNode(clean[0].length());
  ListNode first = ans; 

  for (int i = 1; i< clean.length; i++){
    ans.next = new ListNode(clean[i].length());
    ans = ans.next; 
  }

return first; 
    } 
}