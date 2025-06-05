package com.btinordertraversal;
import java.util.*;


class Solution {
    private static Map<TreeNode, Boolean> visited = new HashMap<>();
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();

        // base case no root node
        if (root == null) {
            return values;
        }

        // base case, root node without children
        if (root.left == null && root.right == null) {
            values.add(root.val);
            return values;
        }

        Stack<TreeNode> nodes = new Stack<>();
        nodes.add(root);
        visited.put(root, false);
        traverseTree(root, values, nodes);
        return values;
    }

    private static void traverseTree(TreeNode node, List<Integer> values, Stack<TreeNode> nodes) {
        while (node.left != null && (visited.get(node.left) == null || !visited.get(node.left))) {
            node = node.left;
            nodes.add(node);
            visited.put(node, false);
        }

        visited.replace(node, true);
        values.add(nodes.pop().val);

        if (node.right != null) {
            node = node.right;
            nodes.add(node);
            visited.put(node, false);
            traverseTree(node, values, nodes);
        }

        if (nodes.empty()) { return; }
        traverseTree(nodes.getLast(), values, nodes);
    }
}
