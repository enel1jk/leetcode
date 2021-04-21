package flattenbinarytreetolinkedlist;

import common.TreeNode;
import common.utils.TreeUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlattenBinaryTreeToLinkedListTest {
    FlattenBinaryTreeToLinkedList.Solution solution;
    private TreeNode head1;
    private TreeNode target1;
    private TreeNode head2;
    private TreeNode target2;
    private TreeNode head3;
    private TreeNode target3;

    @Before
    public void setup() {
        solution = new FlattenBinaryTreeToLinkedList.Solution();
        head1 = TreeUtil.constructTree("1,2,5,3,4,#,6");
        target1 = TreeUtil.constructTree("1,#,2,#,3,#,4,#,5,#,6");
        head2 = null;
        target2 = null;
        head3 = new TreeNode(0);
        target3 = TreeUtil.constructTree("0");
    }

    @Test
    public void testFlatten() {
        solution.flatten(head1);
        Assert.assertEquals(head1, target1);
        solution.flatten(head2);
        Assert.assertEquals(head2, target2);
        solution.flatten(head3);
        Assert.assertEquals(head3, target3);
    }

}
