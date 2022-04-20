
package tree;

import basics.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import tree.TreeHeight;

public class LevelOrder {
    public static void levelOrderUtil(TreeNode node, ArrayList<Integer> res) {
/******* using tree height to print a binary tree is not a good idea ***********
        if (node == null) return;
        if (level == 1) {res.add(node.val);System.out.print(node.val + " ");
        }
        else if (level > 1) {
            levelOrderUtil(node.left, res, level - 1);
            levelOrderUtil(node.right, res, level - 1);
        }
*/
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(node);
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            res.add(tmp.val);
            if (tmp.left != null) queue.add(tmp.left);
            if (tmp.right != null) queue.add(tmp.right);
        }
    }

    public static void main(String[] args) {
        TreeNode node0 = new TreeNode(4);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(2,node0,node1);
        TreeNode test = new TreeNode(1,node3, node2);
        ArrayList<Integer> res = new ArrayList<>();
        levelOrderUtil(test, res);
        System.out.println(res);
    }
}
