package lcof._3_findrepeatnumber;

import lcof._3_findrepeatnumber.FindRepeatNumber.Solution1;
import lcof._3_findrepeatnumber.FindRepeatNumber.Solution2;
import org.junit.Assert;
import org.junit.Test;

public class FindRepeatNumberTest {

    @Test
    public void testFindRepeatNumber() {
        int[] nums   = new int[]{2, 3, 1, 0, 2, 5, 3};
        int   result = new Solution1().findRepeatNumber(nums);
        Assert.assertTrue(result == 2 || result == 3);

        result = new Solution2().findRepeatNumber(nums);
        Assert.assertTrue(result == 2 || result == 3);
    }
}
