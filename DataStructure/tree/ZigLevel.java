//package tree;
//
//import basics.TreeNode;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class ZigLevel {    
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        List<List<Integer>> res = new ArrayList<>();
//
//        LinkedList<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        boolean tag = true;
//        while (!queue.isEmpty()) {
//            LinkedList<Integer> tmp = new LinkedList<>();
//            int n = queue.size();
//            TreeNode node = queue.poll();
//            // (tag == true) ? tmp.add(node.val) : tmp.addFrist(node.val);
//            if (tag) tmp.add(node.val);
//            else tmp.addFrist(node.val);
//            if (node.left != null) queue.add(node.left);
//            if (node.right != null) queue.add(node.right);
//
//            res.add(tmp);
//            tag = !tag;
//        }
//        return res;
//}
//}
