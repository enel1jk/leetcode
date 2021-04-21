package binarytree;

import common.TreeNode;
import common.utils.TreeUtil;
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
        root = TreeUtil.constructTree("4,2,5,1,3,#,6,0,#");
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

    @Test
    public void testLevelOrder() {
        TreeNode root = TreeUtil.constructTree("3,9,20,#,#,15,7");
        traversal.levelOrder(root);
    }

    // TODO: 2021/4/21 老代码用新的工具类重写
}
