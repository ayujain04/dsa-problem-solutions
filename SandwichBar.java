import java.util.HashSet;

import javax.net.ssl.SSLEngine;
import javax.rmi.ssl.SslRMIClientSocketFactory;

import java.util.ArrayList; 

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
   /* Search through order and see if their are the ingredients available in 
    * available for me to make this meal. 
    maybe, I make an array of strings of each order. 
    Then, I check to see if that array is fully completed by the 
    ingredients. If so, I return the index of that array, 
    so I'll have to store that value and then return it. 
    */
    HashSet<String> available1 = new HashSet<String>();
   for(String z: available){
      available1.add(z);
   }
    int fail = -1; 
    int totalOrder = -1; 
    int count = 0; 

    for(int i = 0; i<orders.length; i++){
      String[] arr = orders[i].split(" ");
      totalOrder = arr.length;
      for (String s: arr){
         if(available1.contains(s)){
            count++; 
         }
         if (count==totalOrder){
            return i;
         } 
      }

      count = 0; 
    }


    return fail; 
   }
 }

