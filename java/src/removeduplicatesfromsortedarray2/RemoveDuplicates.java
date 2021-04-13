package removeduplicatesfromsortedarray2;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/solution/shan-chu-pai-xu-shu-zu-zhong-de-zhong-fu-yec2/">删除有序数组中的重复项 II</a>
 */
public class RemoveDuplicates {
    public static class Solution1 {
        public int removeDuplicates(int[] nums) {
            if (nums == null) return 0;
            int len = nums.length;
            if (len < 3) return len;

            int           count;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] != nums[i + 2]) {
                    list.add(nums[i]);
                }
            }
            list.add(nums[len - 2]);
            list.add(nums[len - 1]);
            count = list.size();
            for (int i = 0; i < list.size(); i++) {
                nums[i] = list.get(i);
            }
            return count;
        }
    }

    public static class Solution2 {
        public int removeDuplicates(int[] nums) {
            return removeDuplicates(nums, 2);
        }

        private int removeDuplicates(int[] nums, int k) {
            if (nums == null) return 0;
            int len = nums.length;
            if (len < k) return len;

            int slow = k;
            int fast = slow;
            while (fast < len) {
                if (nums[slow - k] != nums[fast]) {
                    nums[slow] = nums[fast];
                    slow++;
                }
                fast++;
            }
            return slow;
        }
    }
}
