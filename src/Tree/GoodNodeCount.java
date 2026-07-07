package Tree;

public class GoodNodeCount {
    int goodNodes;
    public int goodNodes(TreeNode root) {

        int goodNodes = 0;
        if(root!= null){
            return countgoodNodes(root, root.val);
        }else{
            return 0;
        }


    }

    int countgoodNodes(TreeNode root, int maxValue) {
        if(root == null){
            return goodNodes;
        }
        if(root.val == maxValue || root.val > maxValue){
            goodNodes++;
            maxValue = root.val;
        }
        countgoodNodes(root.left, maxValue);
        countgoodNodes(root.right,maxValue);
        return goodNodes;
    }


}
