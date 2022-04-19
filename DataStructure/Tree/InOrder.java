package Tree;

import Basics.TreeNode;

import java.util.ArrayList;

public class InOrder {
    public void inOrderUtil(TreeNode node, ArrayList<Integer> res) {
        if (node == null) {
            return;
        }
        inOrderUtil(node.left, res);
        res.add(node.val);
        inOrderUtil(node.right, res);
    }

    public static void main(String[] args) {
        TreeNode node0 = new TreeNode(4);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(2,node0,node1);
        TreeNode test = new TreeNode(1,node3, node2);
        InOrder inOrder = new InOrder();
        ArrayList<Integer> res = new ArrayList<>();
        inOrder.inOrderUtil(test,res);
//        for (Object num : res.toArray()) 
        System.out.println(res.toString());
    }
}
