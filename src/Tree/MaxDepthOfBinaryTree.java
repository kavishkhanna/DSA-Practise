package Tree;

public class MaxDepthOfBinaryTree {



    public int maxDepth(TreeNode root) {
        int maxDepth = 0;
        if(root == null){
            return maxDepth;
        }

        int leftSize = maxDepth(root.left);
        int rightSize = maxDepth(root.right);

        return Math.max(leftSize, rightSize)  + 1;
    }





}
