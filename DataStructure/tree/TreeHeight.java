package tree;

import basics.TreeNode;

public class TreeHeight {
    public static int treeHeight(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = treeHeight(node.left);
            int rightHeight = treeHeight(node.right);
            return (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;
        }
    }

    public static void main(String[] args) {

        TreeNode node0 = new TreeNode(4);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(2,node0,node1);
        TreeNode test = new TreeNode(1,node3, node2);

        System.out.println(treeHeight(test));
    }
}
