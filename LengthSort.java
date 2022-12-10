import java.util.Comparator;
import java.util.Arrays; 

public class LengthSort {
    public String[] rearrange(String[] values){
        Comparator<String> len = Comparator.comparing(String::length);
       Comparator<String> alpha = Comparator.naturalOrder(); 
       Comparator<String> total = len.thenComparing(alpha);



         Arrays.sort(values, total);
         return values; 

    }
}