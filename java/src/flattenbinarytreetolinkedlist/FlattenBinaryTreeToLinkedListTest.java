package flattenbinarytreetolinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlattenBinaryTreeToLinkedListTest {
    FlattenBinaryTreeToLinkedList.Solution solution;
    private TreeNode head1;
    private String   target1;
    private TreeNode head2;
    private String   target2;
    private TreeNode head3;
    private String   target3;

    @Before
    public void setup() {
        solution = new FlattenBinaryTreeToLinkedList.Solution();
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n2 = new TreeNode(2, n3, n4);
        TreeNode n6 = new TreeNode(6);
        TreeNode n5 = new TreeNode(5, null, n6);
        TreeNode n1 = new TreeNode(1, n2, n5);
        head1 = n1;
        target1 = "1,null,2,null,3,null,4,null,5,null,6";
        head2 = null;
        target2 = "null";
        head3 = new TreeNode(0);
        target3 = "0";
    }

    @Test
    public void testFlatten() {
        solution.flatten(head1);
        Assert.assertEquals(TreeNode.preorderString(head1), target1);
        solution.flatten(head2);
        Assert.assertEquals(TreeNode.preorderString(head2), target2);
        solution.flatten(head3);
        Assert.assertEquals(TreeNode.preorderString(head3), target3);
    }

}
