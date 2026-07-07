package Tree;

class LowestCommonRoot {
    //searching in the BST so both the nodes p and q will be on one side of the tree.
    //and if we both the values are less than the root then we go left otherwise right
    //if one of the value will be equal root then we give out the root.
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(p.val<root.val&&q.val<root.val) {
            return lowestCommonAncestor(root.left,p,q); //
        }
        else if(p.val>root.val&&q.val>root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        else
            return root;
    }
}
