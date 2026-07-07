package Tree;

public class SubTree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null){
            return true;
        }
        if(root == null && subRoot!= null){
            return false;
        }
        if(root.val == subRoot.val){
           return isSameTree(root, subRoot);
        }
        else if(root.left.val == subRoot.val){
           return isSameTree(root.left, subRoot);
        }else if(root.right.val == subRoot.val){
          return isSameTree(root.right, subRoot);
        }

return false;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null){
            return true;
        }
        boolean right = false;
        boolean left = false;
        if(null != p && null !=q && p.val == q.val ){
            right = isSameTree(p.right, q.right);
            left = isSameTree(p.left, q.left);
        }
        return right && left;
    }

}
