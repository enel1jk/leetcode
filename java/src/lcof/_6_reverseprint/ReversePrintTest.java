package lcof._6_reverseprint;

import common.ListNode;
import lcof._6_reverseprint.ReversePrint.Solution1;
import lcof._6_reverseprint.ReversePrint.Solution2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReversePrintTest {
    ListNode head = null;

    @Before
    public void setup() {
        head = ListNode.fromArray(1, 3, 2);
    }

    @Test
    public void testSolution1() {
        Assert.assertArrayEquals(new Solution1().reversePrint(head), new int[]{2, 3, 1});
    }

    @Test
    public void testSolution2() {
        Assert.assertArrayEquals(new Solution2().reversePrint(head), new int[]{2, 3, 1});
    }
}
