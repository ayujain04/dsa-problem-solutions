import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet; 

public class MemberCheck {
    public String[] whosDishonest(String[] club1, 
                                  String[] club2, 
                                  String[] club3) {
      
        List<String> answer = new ArrayList<>(); 
        List<String> club1List = Arrays.asList(club1); 
        List<String> club2List = Arrays.asList(club2); 
        List<String> club3List = Arrays.asList(club3); 
            for(String c: club1){
            if((Collections.frequency(club2List, c)>0)||(Collections.frequency(club3List, c)>0)){
                answer.add(c); 
            }
        }
        for(String i: club2){
            if((Collections.frequency(club3List, i)>0)||(Collections.frequency(club1List, i)>0)){
                answer.add(i); 
            }
        }

        for(String p: club3){
            if((Collections.frequency(club1List, p)>0)||(Collections.frequency(club2List, p)>0)){
                answer.add(p); 
            }
        }

        Set<String> temp = new HashSet<>(); 

        for(String c: answer){
            temp.add(c); 
        }
        
        List<String> answerTemp = new ArrayList<>(); 

        for(String d: temp){
            answerTemp.add(d); 
        }

        
        String[] answerArr = new String [answerTemp.size()]; 

        for(int i = 0; i<answerArr.length; i++){
            answerArr[i] = answerTemp.get(i); 
        }
        Arrays.sort(answerArr); 
        return answerArr; 
    }
 }
