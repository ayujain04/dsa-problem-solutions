public class PathSum {
    public int hasPath(int target, TreeNode tree){
        if(tree == null){
        return 0; 
       }
       if(tree.left == null && tree.right == null && tree.info == target){
        return 1; 
       }
        int right = hasPath(target-tree.info, tree.right);
        int left = hasPath(target-tree.info, tree.left);
        return Math.max(left, right);
    }
}
