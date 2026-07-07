package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;



//ek queue banani hai
//fhir us queue me root ko add kar dena hai
//next ek for loop lagani hai equal to size of the queue
// or fhir us queue me se poll karke values dalni hai list me

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new ArrayDeque<>();

        if (root == null) {
            return lst;
        }

        q.offer(root);
        while (!q.isEmpty()) {
            int count = q.size();
            List<Integer> res = new ArrayList<>();

            for (int i = 0; i < count; i++) {
                TreeNode node = q.poll();
                res.add(node.val);

                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            lst.add(res);
        }
        return lst;
    }
}
