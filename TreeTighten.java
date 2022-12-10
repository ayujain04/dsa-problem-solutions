public class TreeTighten {
  
    public TreeNode tighten(TreeNode t) {
        //base case 1: tree entered is null: 
        if(t==null){
            return null;
        }
        //base case two: we are at the last node
        if(t.left == null && t.right == null){
            return t; 
        }
       t.left = tighten(t.left);
       t.right =  tighten(t.right);

        if(t.left == null && t.right != null){
            return t.right; 
        }

        if(t.left != null && t.right == null){
            return t.left; 
        }
        return t; 

    }
}