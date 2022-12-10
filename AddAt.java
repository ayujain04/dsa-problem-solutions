public class AddAt {
    public ListNode addAt(ListNode list, ListNode toAdd, int index) {      
        ListNode first = list; 
        if(first ==null){
            return toAdd; 
        }
        if(toAdd == null){
            return first; 
        }
      
        if(index == 0){
            first = toAdd; 
            while(toAdd.next!=null){
                toAdd = toAdd.next; 
            }
            toAdd.next = list; 
            return first; 
        }
        int i = 0; 
        while(i<index-1){
            list = list.next; 
            i++; 
        }
        ListNode after = list.next; 
        list.next = toAdd; 

        while(list.next!=null){
            list = list.next; 
        }
        list.next = after; 
        
        return first; 
    }
  }
