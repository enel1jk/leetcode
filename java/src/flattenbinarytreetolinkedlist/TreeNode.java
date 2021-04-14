package flattenbinarytreetolinkedlist;

public class TreeNode {
    int      val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static String preorderString(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorder(root, (node) -> {
            sb.append(sb.length() == 0 ? "" : ",")
              .append(node == null ? "null" : node.val);
        });
        return sb.toString();
    }

    private static void preorder(TreeNode root, Converter converter) {
        converter.convert(root);
        if (root != null) {
            if (root.left != null || root.right != null) {
                preorder(root.left, converter);
                preorder(root.right, converter);
            }
        }
    }

    private interface Converter {
        void convert(TreeNode node);
    }
}
