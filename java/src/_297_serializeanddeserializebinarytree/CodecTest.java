package _297_serializeanddeserializebinarytree;

import _297_serializeanddeserializebinarytree.Codec.Solution;
import _297_serializeanddeserializebinarytree.Codec.Solution1;
import _297_serializeanddeserializebinarytree.Codec.Solution2;
import common.TreeNode;
import common.utils.TreeUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CodecTest {

    TreeNode root1, root2, root3, root4;
    private Solution1 solution1;
    private Solution2 solution2;

    @Before
    public void setup() {
        solution1 = new Solution1();
        solution2 = new Solution2();
        root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        root2 = null;
        root3 = new TreeNode(1);
        root4 = new TreeNode(1, new TreeNode(2), null);
    }

    @Test
    public void testSolution1() {
        test(solution1);
    }


    @Test
    public void testSolution2() {
        test(solution2);
    }

    private void test(Solution solution) {
        String   serialized1   = solution.serialize(root1);
        TreeNode deserialized1 = solution.deserialize(serialized1);
        print(root1, serialized1, deserialized1);
        Assert.assertEquals(root1, deserialized1);

        String   serialized2   = solution.serialize(root2);
        TreeNode deserialized2 = solution.deserialize(serialized2);
        print(root2, serialized2, deserialized2);
        Assert.assertEquals(root2, deserialized2);

        String   serialized3   = solution.serialize(root3);
        TreeNode deserialized3 = solution.deserialize(serialized3);
        print(root3, serialized3, deserialized3);
        Assert.assertEquals(root3, deserialized3);

        String   serialized4   = solution.serialize(root4);
        TreeNode deserialized4 = solution.deserialize(serialized4);
        print(root4, serialized4, deserialized4);
        Assert.assertEquals(root4, deserialized4);

    }

    private void print(TreeNode root, String serialized, TreeNode deserialized) {
        System.out.println("raw: ");
        TreeUtil.printTree(root);
        System.out.println("serialized: " + serialized);
        System.out.println("deserialized: ");
        TreeUtil.printTree(deserialized);
        System.out.println("--------\r\n");
    }

}
