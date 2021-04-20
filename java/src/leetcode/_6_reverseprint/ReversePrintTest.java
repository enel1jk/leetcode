package leetcode._6_reverseprint;

import leetcode._6_reverseprint.ReversePrint.Solution1;
import leetcode._6_reverseprint.ReversePrint.Solution2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReversePrintTest {
    ListNode head = null;

    @Before
    public void setup() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        head = l1;
        l1.next = l3;
        l3.next = l2;
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
