package Tree;

public class SameTree {
    public static void main(){

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
