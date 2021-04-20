package leetcode._6_reverseprint;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <a href="https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/solution/mian-shi-ti-06-cong-wei-dao-tou-da-yin-lian-biao-d/">剑指 Offer 06. 从尾到头打印链表</a>
 */
public class ReversePrint {

    public static class Solution1 {
        public int[] reversePrint(ListNode head) {
            Stack<Integer> stack = new Stack<>();
            while (head != null) {
                stack.push(head.val);
                head = head.next;
            }
            int   size   = stack.size();
            int[] result = new int[size];
            for (int i = 0; i < size; i++) {
                result[i] = stack.pop();
            }
            return result;
        }
    }

    public static class Solution2 {
        public int[] reversePrint(ListNode head) {
            List<Integer> tmp = new ArrayList<>();
            recurAdd(head, tmp);
            int   size   = tmp.size();
            int[] result = new int[size];
            for (int i = 0; i < size; i++) {
                result[i] = tmp.get(i);
            }
            return result;
        }

        private void recurAdd(ListNode node, List<Integer> list) {
            if (node != null) {
                recurAdd(node.next, list);
                list.add(node.val);
            }
        }

    }
}
