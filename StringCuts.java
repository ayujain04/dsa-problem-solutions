import java.util.ArrayList;
import java.util.HashSet;

public class StringCuts {
    /**
     * @param list
     * @param minLength
     * @return
     */
    public String[] filter(String[] list, int minLength) {
        /*Idea: 
        make an array list. 
        Iterate through list, 
        find the values greateer than minLenght 
        add those to array list
        make an array of the array list's size
        add those values to the array 
        return that array
        */

        ArrayList<String> matthew = new ArrayList<>(); 

        for(String s: list){
            if(s.length()>=minLength){
                if (!(matthew.contains(s))){
                    matthew.add(s);
                }
            }
        }

        String[] samantha = new String[matthew.size()]; 
        for(int i = 0; i<matthew.size(); i++){
            samantha[i] = matthew.get(i);
        }



       return samantha; 
    }
}