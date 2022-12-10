import java.util.HashMap;
public class PairDown {
    public int[] fold(int[] list) {
  //make a map that maps integers to sums. 
  //integers are the index in answer that you will go to. 
  //keyset.size = answer.length
HashMap<Integer, Integer> map = new HashMap<>(); 
int count = 0; 
int otherCount = 0; 
  for(int i = 0; i<list.length/2;i++){
    if(otherCount+1<list.length){
        map.put(count, list[otherCount]+list[otherCount+1]);
        
    }
    else{
        map.put(count, list[list.length-1]);
    }
    otherCount++;
    otherCount++; 
    count++;
  }
if(list.length%2==0){
    int[] answer = new int[map.size()];
  for(int i = 0; i< answer.length; i++){
    answer[i] =map.get(i);
  }
  return answer;
}
else{
    int[] answer = new int[map.size()+1];
    for(int i = 0; i< answer.length-1; i++){
        answer[i] =map.get(i);
      }
      answer[answer.length-1] = list[list.length-1];
      return answer; 
}
  
    
    }
}
