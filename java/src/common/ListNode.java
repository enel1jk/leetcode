package common;

public class ListNode {
    public int      val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode fromArray(int... array) {
        ListNode head = new ListNode(0);
        ListNode p    = head;
        for (int i : array) {
            p.next = new ListNode(i);
            p = p.next;
        }
        return head.next;
    }

    /**
     * @return "[1,2,3,4,5]"
     */
    public static String toListString(ListNode head) {
        if (head == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        ListNode n = head;
        while (true) {
            sb.append(n.val);
            if (n.next != null) {
                sb.append(',');
                n = n.next;
            } else {
                return sb.append(']').toString();
            }
        }
    }

    public String toListString() {
        return toListString(this);
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
