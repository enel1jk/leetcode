package flattenbinarytreetolinkedlist;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/">二叉树展开为链表</a>
 */
public class FlattenBinaryTreeToLinkedList {

    public static class Solution {
        public void flatten(TreeNode root) {
            List<TreeNode> list = new ArrayList<>();
            preorder(root, list);
            for (int i = 0; i < list.size() - 1; i++) {
                TreeNode node = list.get(i);
                TreeNode next = list.get(i + 1);
                node.left = null;
                node.right = next;
            }
        }

        private void preorder(TreeNode root, List<TreeNode> list) {
            if (root == null) return;
            list.add(root);
            preorder(root.left, list);
            preorder(root.right, list);
        }
    }

    public static class Solution2{
        // TODO: 2021/4/14 Iteration
    }

    public static class Solution3{
        // TODO: 2021/4/14 "进阶：你可以使用原地算法（O(1) 额外空间）展开这棵树吗？"

    }
}
