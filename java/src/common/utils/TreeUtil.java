package common.utils;

import common.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TreeUtil {

    private final static TreePrinter<TreeNode> printer = new TreePrinter<>(
            n -> String.valueOf(n.val),
            n -> n.left,
            n -> n.right);

    public static void printTree(TreeNode root) {
        printer.printTree(root);
    }

    /**
     * 输入层序遍历的二叉树数组，生成二叉树。
     * <p>
     * input: [3,9,20,#,#,15,7]
     * <p>
     * output:
     * <pre>
     *       3
     *      / \
     *     9  20
     *       /  \
     *      15   7
     * </pre>
     */
    public static TreeNode constructTree(String... arr) {
        if (arr == null || arr.length == 0 || "#".equals(arr[0]) || "".equals(arr[0])) return null;
        Queue<String>   dataQueue = new LinkedList<>(Arrays.asList(arr));
        TreeNode        root      = new TreeNode(Integer.parseInt(dataQueue.poll()));
        Queue<TreeNode> queue     = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (dataQueue.isEmpty()) break;
            String val = dataQueue.poll();
            if (!"#".equals(val)) {
                node.left = new TreeNode(Integer.parseInt(val));
                queue.offer(node.left);
            }
            if (dataQueue.isEmpty()) break;
            val = dataQueue.poll();
            if (!"#".equals(val)) {
                node.right = new TreeNode(Integer.parseInt(val));
                queue.offer(node.right);
            }
        }
        return root;
    }

    /**
     * @param str "3,9,20,#,#,15,7"
     *            "[3,9,20,#,#,15,7]"
     */
    public static TreeNode constructTree(String str) {
        str = str.startsWith("[") ? str.substring(1, str.length() - 1) : str;
        return constructTree(str.split(","));
    }

    public static int depth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
}
