package _105_buildtree;

import _105_buildtree.BuildTree.Solution1;
import _105_buildtree.BuildTree.Solution2;
import common.TreeNode;
import common.utils.TreeUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuildTreeTest {

    private int[]    preorder;
    private int[]    inorder;
    private TreeNode target;

    @Before
    public void setup() {
        preorder = new int[]{3, 9, 20, 15, 7};
        inorder = new int[]{9, 3, 15, 20, 7};
        target = TreeUtil.constructTree("3,9,20,#,#,15,7");
    }

    @Test
    public void testSolution1() {
        TreeNode result = new Solution1().buildTree(preorder, inorder);
        TreeUtil.printTree(result);
        Assert.assertEquals(target, result);
    }

    @Test
    public void testSolution2() {
        TreeNode result = new Solution2().buildTree(preorder, inorder);
        TreeUtil.printTree(result);
        Assert.assertEquals(target, result);
    }

}
