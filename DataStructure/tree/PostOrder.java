package tree;

import basics.TreeNode;

import java.util.ArrayList;

public class PostOrder {
    public void postOrderUtil(TreeNode node, ArrayList<Integer> res) {
        if (node == null) {
            return;
        }
        postOrderUtil(node.left, res);
        postOrderUtil(node.right, res);
        res.add(node.val);
    }

    public static void main(String[] args) {
        TreeNode node0 = new TreeNode(4);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(2,node0,node1);
        TreeNode test = new TreeNode(1,node3, node2);
        PostOrder postOrder = new PostOrder();
        ArrayList<Integer> res = new ArrayList<>();
        postOrder.postOrderUtil(test,res);
//        for (Object num : res.toArray()) 
        System.out.println(res.toString());
    }
}
