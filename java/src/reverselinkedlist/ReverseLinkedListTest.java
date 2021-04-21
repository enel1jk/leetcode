package reverselinkedlist;

import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class ReverseLinkedListTest {

    @Test
    public void testReverse() {
        ReverseLinkedList reverse = new ReverseLinkedList();

        ListNode head1 = ListNode.fromArray(1, 2, 3, 4, 5);
        head1 = reverse.reverseIteration(head1);
        Assert.assertEquals(head1.toListString(), "[5,4,3,2,1]");

        ListNode head2 = ListNode.fromArray(1, 2, 3, 4, 5);
        head2 = reverse.reverseRecursion(head2);
        Assert.assertEquals(head2.toListString(), "[5,4,3,2,1]");
    }
}
