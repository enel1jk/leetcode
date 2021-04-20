package leetcode._3_findrepeatnumber;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/">剑指 Offer 03. 数组中重复的数字</a>
 */
public class FindRepeatNumber {
    public static class Solution1 {
        public int findRepeatNumber(int[] nums) {
            if (nums == null) return -1;
            Set<Integer> set = new HashSet<>();
            for (int n : nums) {
                if (!set.add(n)) {
                    return n;
                }
            }
            return -1;
        }
    }

    public static class Solution2 {
        public int findRepeatNumber(int[] nums) {
            int tmp;
            for (int i = 0; i < nums.length; i++) {
                while (nums[i] != i) {
                    if (nums[i] == nums[nums[i]]) {
                        return nums[i];
                    }
                    tmp = nums[i];
                    nums[i] = nums[tmp];
                    nums[tmp] = tmp;
                }
            }
            return -1;
        }
    }

}
