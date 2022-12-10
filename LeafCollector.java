import java.util.ArrayList;


public class LeafCollector {

    public String[] getLeaves(TreeNode tree) {
        ArrayList<String> temp = new ArrayList<>(); 

        while(tree.left !=null){
            ArrayList<String> t = new ArrayList<>(); 
            all(tree, t);
            String poop = String.join(" ", t);
            temp.add(poop);
        }

        while(tree.right !=null){
            ArrayList<String> p = new ArrayList<>(); 
            all(tree, p);
            String fart = String.join(" ", t);
            temp.add(fart);
        }

        temp.add(tree.info+""); 
        String[] ans = new String[temp.size()];
        int i = 0; 
        for(String s:temp){
            ans[i] = s; 
            i++; 
        }
        return ans; 
    }
    public void all(TreeNode tree, ArrayList<String> list){
        if(tree!=null){

        if(tree.left !=null && tree.left.left == null && tree.left.right == null){
            list.add(tree.left.info +"");
            tree.left = null;
        }
        all(tree.left, list);


        if(tree.right != null && tree.right.left == null && tree.right.right == null){
            list.add(tree.right.info+"");
            tree.right = null; 
        }
        all(tree.right, list);


        }
    }
}