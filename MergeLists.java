
public class MergeLists {
    public ListNode weave (ListNode a, ListNode b) {

        ListNode answer = a; 

        while((a!=null)&&(b!=null)){
            ListNode temp = a.next; 
            a.next = b; 
            b = b.next; 
            a = a.next; 
            a.next = temp; 
            a = a.next; 
        }
 
        return answer; 

}


    
}