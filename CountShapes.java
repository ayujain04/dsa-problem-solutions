public class CountShapes {
    public int count(TreeNode countThis, TreeNode root) {
        if(root == null) return 0; 
        int counter = 0; 
        if(check(countThis, root)){
            counter = 1; 
        }
        return(count(countThis, root.left)+count(countThis, root.right)+counter);

    }
    public boolean check(TreeNode sub, TreeNode head){
        if(sub == null){
            return true; 
        }
        if(head.left == null && sub.left!=null) return false; 
        if(head.right ==null && sub.right!=null) return false; 
        return(check(sub.right, head.right) && check(sub.left, head.left));
    }
  }