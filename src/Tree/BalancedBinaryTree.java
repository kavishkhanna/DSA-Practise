package Tree;

public class BalancedBinaryTree {
    boolean isBalanced = true;
    public boolean isBalanced(TreeNode root) {

    height(root);
    return isBalanced;
    }

    int height(TreeNode root){
        int height = 0;
        if(root == null){
            return height;
        }
        int left = height(root.left);
        int right = height(root.right);

        if(Math.abs(left - right) > 1){
            isBalanced = false;
        }
        return Math.max(left, right) + 1;
    }



}
