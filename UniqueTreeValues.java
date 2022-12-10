import java.util.*; 

public class UniqueTreeValues {
        public int[] unique(TreeNode root) {
       ArrayList<Integer> vals = new ArrayList<>();
       attempt(root, vals);

       TreeSet<Integer> ans = new TreeSet<>(); 
       for(int v: vals){
        ans.add(v);
       }

       int[] real = new int[ans.size()]; 
       int i = 0; 
       for(int c: ans){
          real[i] = c; 
          i++;
       }
       return real; 

        }
        public void attempt(TreeNode tree, ArrayList<Integer> list){
          if(tree!=null){
            attempt(tree.left, list);
          list.add(tree.info);
          attempt(tree.right, list);
  
          }
          
        }
    }