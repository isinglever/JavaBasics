package Tree;

import Basics.TreeNode;

import java.util.ArrayList;

public class PreOrder {
    public void preOrderUtil(TreeNode node, ArrayList<Integer> res) {
        if (node == null) {
            return;
        }
        res.add(node.val);
        preOrderUtil(node.left, res);
        preOrderUtil(node.right, res);
    }

    public static void main(String[] args) {
        TreeNode node0 = new TreeNode(4);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(2,node0,node1);
        TreeNode test = new TreeNode(1,node3, node2);
        PreOrder preOrder = new PreOrder();
        ArrayList<Integer> res = new ArrayList<>();
        preOrder.preOrderUtil(test,res);
//        for (Object num : res.toArray()) 
        System.out.println(res.toString());
    }
}
