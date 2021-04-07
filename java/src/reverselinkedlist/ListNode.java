package reverselinkedlist;


/**
 * Definition for singly-linked list.
 */
public class ListNode {
    int      val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode arrayToList(int[] array) {
        ListNode head = new ListNode(0);
        ListNode p    = head;
        for (int i : array) {
            p.next = new ListNode(i);
            p = p.next;
        }
        return head.next;
    }

    public static String listToString(ListNode head) {
        if (head == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (head.next != null) {
            sb.append(head.val).append(",");
            head = head.next;
        }
        sb.append(head.val);
        return sb.toString();
    }

}
