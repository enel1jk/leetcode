package _297_serializeanddeserializebinarytree;

import common.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/">297. 二叉树的序列化与反序列化</a>
 */
public class Codec {

    public interface Solution {
        // Encodes a tree to a single string.
        String serialize(TreeNode root);

        // Decodes your encoded data to tree.
        TreeNode deserialize(String data);
    }

    /** 前序 **/
    public static class Solution1 implements Solution {
        // Encodes a tree to a single string.
        @Override
        public String serialize(TreeNode root) {
            if (root == null) return "#";
            return root.val + "," + serialize(root.left) + "," + serialize(root.right);
        }

        // Decodes your encoded data to tree.
        @Override
        public TreeNode deserialize(String data) {
            if (data == null) return null;
            Queue<String> list = new LinkedList<>(Arrays.asList(data.split(",")));
            return rdeserialize(list);
        }

        private TreeNode rdeserialize(Queue<String> queue) {
            if (queue == null || queue.size() == 0) return null;
            String val = queue.poll();
            if (val.equals("#")) return null;
            TreeNode root = new TreeNode(Integer.parseInt(val));
            root.left = rdeserialize(queue);
            root.right = rdeserialize(queue);
            return root;
        }
    }

    /** 广度优先 **/
    public static class Solution2 implements Solution {
        // Encodes a tree to a single string.
        @Override
        public String serialize(TreeNode root) {
            StringBuilder   sb    = new StringBuilder();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node != null) {
                    sb.append(node.val);
                    queue.offer(node.left);
                    queue.offer(node.right);
                } else {
                    sb.append("#");
                }
                sb.append(",");
            }
            return sb.toString();
        }

        // Decodes your encoded data to tree.
        @Override
        public TreeNode deserialize(String data) {
            if (data == null || data.isEmpty() || data.startsWith("#")) return null;
            Queue<String>   dataQueue = new LinkedList<>(Arrays.asList(data.split(",")));
            TreeNode        root      = new TreeNode(Integer.parseInt(dataQueue.poll()));
            Queue<TreeNode> queue     = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node != null) {
                    String val = dataQueue.poll();
                    if (!"#".equals(val)) {
                        node.left = new TreeNode(Integer.parseInt(val));
                        queue.offer(node.left);
                    }
                    val = dataQueue.poll();
                    if (!"#".equals(val)) {
                        node.right = new TreeNode(Integer.parseInt(val));
                        queue.offer(node.right);
                    }
                }
            }
            return root;
        }
    }

}
