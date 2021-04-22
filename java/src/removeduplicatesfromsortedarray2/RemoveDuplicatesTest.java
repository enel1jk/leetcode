package removeduplicatesfromsortedarray2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import removeduplicatesfromsortedarray2.RemoveDuplicates.Solution1;
import removeduplicatesfromsortedarray2.RemoveDuplicates.Solution2;

import java.util.Arrays;

public class RemoveDuplicatesTest {
    int[] nums1, nums2;
    int count1, count2;
    int[] result1, result2;

    @Before
    public void setup() {
        nums1 = new int[]{1, 1, 1, 2, 2, 3};
        count1 = 5;
        result1 = new int[]{1, 1, 2, 2, 3};
        nums2 = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        count2 = 7;
        result2 = new int[]{0, 0, 1, 1, 2, 3, 3};
    }

    @Test
    public void testSolution1() {
        Solution1 solution = new Solution1();
        Assert.assertEquals(solution.removeDuplicates(nums1), count1);
        Assert.assertArrayEquals(Arrays.copyOf(nums1, count1), result1);

        Assert.assertEquals(solution.removeDuplicates(nums2), count2);
        Assert.assertArrayEquals(Arrays.copyOf(nums2, count2), result2);
    }

    @Test
    public void testSolution2() {
        Solution2 solution = new Solution2();
        Assert.assertEquals(solution.removeDuplicates(nums1), count1);
        Assert.assertArrayEquals(Arrays.copyOf(nums1, count1), result1);

        Assert.assertEquals(solution.removeDuplicates(nums2), count2);
        Assert.assertArrayEquals(Arrays.copyOf(nums2, count2), result2);
    }
}
