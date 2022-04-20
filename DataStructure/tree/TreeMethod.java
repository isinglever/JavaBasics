package tree;

import basics.TreeNode;

public class TreeMethod {

    public static int treeHeight(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = treeHeight(node.left);
            int rightHeight = treeHeight(node.right);
            return (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;
        }
    }
}
