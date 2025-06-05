package com.btinordertraversal;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if (root == null) { return l; }
        traverseTree(root,l);
        return l;
    }

    private static void traverseTree(TreeNode node, List<Integer> l) {
        if (node != null) {
            traverseTree(node.left, l);
            l.add(node.val);
            traverseTree(node.right,l);
        }
    }
}
