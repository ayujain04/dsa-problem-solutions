import java.util.HashSet;

public class DNAMaxNucleotide {
  
    public String max(String[] strands, String nuc) {
int [] nucNum = new int[strands.length]; 
for(int p = 0; p<nucNum.length; p++){
    nucNum[p] = 0;
}
    for(int i = 0; i<strands.length; i++){
        char[] strand = strands[i].toCharArray();
        for (char s:strand){
            if (nuc.toCharArray()[0] == s){
                nucNum[i]++;
            }
        }
    }

    int max = 0;
    int maxIndex = -1;
    for(int n = 0; n<nucNum.length; n++){
        if (nucNum[n]>max){
            max = nucNum[n];
            maxIndex = n; 
        }
    }

    HashSet<String> maxes = new HashSet<>();

    for(int j = 0; j<nucNum.length; j++){
        if(nucNum[j]==max){
            maxes.add(strands[j]);
        }
    }

    if(maxIndex == -1){
        return "";
    }

    String longest = "";

    for (String s: maxes){
        if(s.length()>longest.length()){
            longest = s; 
        }
    }

    
    return longest;
    

 }
}