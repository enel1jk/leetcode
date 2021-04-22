package _105_buildtree;

import common.TreeNode;

import java.util.HashMap;

/**
 * <a href="https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/">105. 从前序与中序遍历序列构造二叉树</a>
 */
public class BuildTree {
    public static class Solution1 {
        private HashMap<Integer, Integer> map;

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            if (preorder == null) return null;
            int len = preorder.length;
            map = new HashMap<>();
            for (int i = 0; i < len; i++) {
                map.put(inorder[i], i);
            }
            return buildTree(preorder, inorder, 0, len - 1, 0, len - 1);
        }

        private TreeNode buildTree(int[] preorder, int[] inorder, int preorderL, int preorderR, int inorderL, int inorderR) {
            if (preorderL > preorderR) return null;
            TreeNode root      = new TreeNode(preorder[preorderL]);
            int      index     = map.get(root.val);
            int      leftNodes = index - inorderL;
            root.left = buildTree(preorder, inorder, preorderL + 1, preorderL + leftNodes, inorderL, index - 1);
            root.right = buildTree(preorder, inorder, preorderL + leftNodes + 1, preorderR, index + 1, inorderR);
            return root;
        }
    }

    public static class Solution2 {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            // TODO: 2021/4/22
            return null;
        }
    }

}
