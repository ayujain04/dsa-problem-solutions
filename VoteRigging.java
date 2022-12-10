import java.util.Collections;
import java.util.PriorityQueue;

public class VoteRigging {
    public int minimumVotes(int[] votes) {
       if(votes.length == 1) return 0; 
       int req = 0; 
       int ourCount = votes[0]; 

       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 
       for(int i = 1; i<votes.length; i++){
        pq.add(votes[i]);
       }

       int winCount = pq.remove(); 
       while(ourCount<=winCount){
        ourCount++; 
        pq.add(winCount-1); 
        req++; 
        winCount = pq.remove(); 
       }
       return req; 
}
 }
