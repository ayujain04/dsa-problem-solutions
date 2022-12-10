import java.util.TreeSet;
public class Closet {
    public String anywhere(String[] list) {
        // replace this with your code
        String temp = String.join(" ", list);
         String[] arr = temp.split(" ");
        TreeSet<String> answer = new TreeSet<>();
         for(String s: arr){
            if(! answer.contains(s)){
                answer.add(s);
            }
         }  
        return String.join(" ", answer);
    }
}