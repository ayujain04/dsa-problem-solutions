import java.util.Arrays;
import java.util.Collections;

public class BigWord {
    public String most(String[] sentences) {
        // you write code heref

        String sentenceString = String.join(" ", sentences);
        sentenceString = sentenceString.toLowerCase();
        String[] sentenceArr = sentenceString.split(" ");


        int max = 0; 

        for(int i = 0; i<sentenceArr.length; i++){
            if(max<Collections.frequency(Arrays.asList(sentenceArr), sentenceArr[i])){
                max = i; 
            }
        }
        return sentenceArr[max];
    }
}
