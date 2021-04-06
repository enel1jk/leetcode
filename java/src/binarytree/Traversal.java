package binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <a href="https://leetcode-cn.com/problems/binary-tree-preorder-traversal/">二叉树的前序遍历</a>
 * <a href="https://leetcode-cn.com/problems/binary-tree-inorder-traversal/">二叉树的中序遍历</a>
 * <a href="https://leetcode-cn.com/problems/binary-tree-postorder-traversal/">二叉树的后序遍历</a>
 */
public class Traversal {
    /** root-l-r */
    public List<Integer> preorderRecursion(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderRecursion(root, result);
        return result;
    }

    private void preorderRecursion(TreeNode root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        preorderRecursion(root.left, result);
        preorderRecursion(root.right, result);
    }

    public List<Integer> preorderIteration(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return result;
    }

    public List<Integer> preorderIteration2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode        node  = root;
        while (node != null || !stack.empty()) {
            while (node != null) {
                result.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop().right;
        }
        return result;
    }


    /** l-root-r */
    public List<Integer> inorderRecursion(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderRecursion(root, result);
        return result;
    }

    private void inorderRecursion(TreeNode root, List<Integer> result) {
        if (root == null) return;
        inorderRecursion(root.left, result);
        result.add(root.val);
        inorderRecursion(root.right, result);
    }

    public List<Integer> inorderIteration(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode        node  = root;
        while (node != null || !stack.empty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            result.add(node.val);
            node = node.right;
        }
        return result;
    }

    /** l-r-root */
    public List<Integer> postorderRecursion(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderRecursion(root, result);
        return result;
    }

    private void postorderRecursion(TreeNode root, List<Integer> result) {
        if (root == null) return;
        postorderRecursion(root.left, result);
        postorderRecursion(root.right, result);
        result.add(root.val);
    }

    public List<Integer> postorderIteration(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode cur = root;
        while (!stack.empty()) {
            TreeNode node = stack.peek();
            if (node.left != null && node.left != cur && node.right != cur) {
                stack.push(node.left);
            } else if (node.right != null && node.right != cur) {
                stack.push(node.right);
            } else {
                result.add(stack.pop().val);
                cur = node;
            }
        }
        return result;
    }

    public List<Integer> postorderIteration2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.empty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);
            if (node.left != null) {
                stack1.push(node.left);
            }
            if (node.right != null) {
                stack1.push(node.right);
            }
        }
        while (!stack2.empty()) {
            result.add(stack2.pop().val);
        }
        return result;
    }

}
