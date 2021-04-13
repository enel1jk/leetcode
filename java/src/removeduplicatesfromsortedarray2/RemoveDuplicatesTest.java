package removeduplicatesfromsortedarray2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class RemoveDuplicatesTest {
    int[] nums1, nums2;
    int count1, count2;
    int[] result1, result2;
    private RemoveDuplicates.Solution1 solution1;
    private RemoveDuplicates.Solution2 solution2;

    @Before
    public void setup() {
        solution1 = new RemoveDuplicates.Solution1();
        solution2 = new RemoveDuplicates.Solution2();
        nums1 = new int[]{1, 1, 1, 2, 2, 3};
        count1 = 5;
        result1 = new int[]{1, 1, 2, 2, 3};
        nums2 = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        count2 = 7;
        result2 = new int[]{0, 0, 1, 1, 2, 3, 3};
    }

    @Test
    public void testSolution1() {
        Assert.assertEquals(solution1.removeDuplicates(nums1), count1);
        Assert.assertArrayEquals(Arrays.copyOf(nums1, count1), result1);

        Assert.assertEquals(solution1.removeDuplicates(nums2), count2);
        Assert.assertArrayEquals(Arrays.copyOf(nums2, count2), result2);
    }

    @Test
    public void testSolution2() {
        Assert.assertEquals(solution2.removeDuplicates(nums1), count1);
        Assert.assertArrayEquals(Arrays.copyOf(nums1, count1), result1);

        Assert.assertEquals(solution2.removeDuplicates(nums2), count2);
        Assert.assertArrayEquals(Arrays.copyOf(nums2, count2), result2);
    }
}
