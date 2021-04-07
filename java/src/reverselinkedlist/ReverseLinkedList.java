package reverselinkedlist;

/**
 * <a href="https://leetcode-cn.com/problems/reverse-linked-list/">反转链表</a>
 */
public class ReverseLinkedList {
    public ListNode reverseIteration(ListNode head) {
        if (head == null) return null;
        ListNode head1 = null;
        ListNode head2 = head;
        while (head2 != null) {
            ListNode tmp = head2.next;
            head2.next = head1;
            head1 = head2;
            head2 = tmp;
        }
        return head1;
    }

    public ListNode reverseRecursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
