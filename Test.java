import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Test{
    //all java programs begin execution in a main method
    public static void main(String[] args)  throws FileNotFoundException {  
            Scanner reader = new Scanner(new File( "First_week/data/testfile.txt"));
            List<String> uniqueWords = new ArrayList<>(); //poorly datastructure algo set up
            //better would have been with a hashSet 
            int numWords = 0; 
            while (reader.hasNext()){
                String word = reader.next(); 
                if (!uniqueWords.contains(word)){
                    numWords++; 
                    uniqueWords.add(word);
                }
                numWords++; 
            }
            System.out.println(numWords); 
          
    }
}
