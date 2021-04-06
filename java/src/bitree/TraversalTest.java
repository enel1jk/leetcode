package bitree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 *          4
 *         / \
 *        2   5
 *       / \   \
 *      1   3   6
 *     /
 *    0
 * </pre>
 */
public class TraversalTest {
    private TreeNode  root;
    private Traversal traversal;

    @Before
    public void root() {
        TreeNode n0 = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);

        n4.left = n2;
        n4.right = n5;
        n2.left = n1;
        n2.right = n3;
        n5.right = n6;
        n1.left = n0;

        root = n4;
        traversal = new Traversal();
    }

    @Test
    public void testPreorder() {
        List<Integer> result = Arrays.asList(4, 2, 1, 0, 3, 5, 6);
        Assert.assertEquals(traversal.preorderRecursion(root), result);
        Assert.assertEquals(traversal.preorderIteration(root), result);
        Assert.assertEquals(traversal.preorderIteration2(root), result);
    }

    @Test
    public void testInorder() {
        List<Integer> result = Arrays.asList(0, 1, 2, 3, 4, 5, 6);
        Assert.assertEquals(traversal.inorderRecursion(root), result);
        Assert.assertEquals(traversal.inorderIteration(root), result);
    }

    @Test(timeout = 500)
    public void testPostorder() {
        List<Integer> result = Arrays.asList(0, 1, 3, 2, 6, 5, 4);
        Assert.assertEquals(traversal.postorderRecursion(root), result);
        Assert.assertEquals(traversal.postorderIteration(root), result);
        Assert.assertEquals(traversal.postorderIteration2(root), result);
    }
}
