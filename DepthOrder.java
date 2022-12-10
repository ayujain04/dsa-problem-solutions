import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Collections; 

public class DepthOrder {
    public int[] order(TreeNode root) {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();         ArrayList<Integer> temp = new ArrayList<>(); 
        int count = 0; 
        fix(root, map, count);
       for(int n: map.keySet()){
            Collections.sort(map.get(n));
             temp.addAll(map.get(n));
       }

       int[] ans = new int[temp.size()];
       for(int i = 0; i<temp.size(); i++){
        ans[i] = temp.get(i);
       }

       return ans; 

    }
    public void fix(TreeNode root, TreeMap<Integer, ArrayList<Integer>> map, int count){
        if(root!=null){
            if(!map.containsKey(count)){
                map.put(count, new ArrayList<>());
            }
            map.get(count).add(root.info); 
            count++; 
            fix(root.left, map, count); 
            fix(root.right, map, count);
           
        }
        
    }
}
