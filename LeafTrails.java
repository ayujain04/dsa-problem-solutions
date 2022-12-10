import java.util.ArrayList;
import java.util.TreeMap;


public class LeafTrails {
    public String[] trails(TreeNode tree) {
    TreeMap<Integer, String> map = new TreeMap<>(); 
    String temp = ""; 
    all(tree, map, temp); 
    int i = 0; 
    String[] ans = new String[map.keySet().size()];
    for(String l: map.values()){
       ans[i] = l; 
        i++; 
    }  
    return ans;     
    }

    public void all(TreeNode tree, TreeMap<Integer, String> map, String temp){
       
        
        if(tree!=null){
            all(tree.left, map, temp+"0");
            all(tree.right, map, temp+"1");    
            if(tree.right==null&&tree.left==null){
                map.put(tree.info, temp);
            }
        }
    
    }

}

