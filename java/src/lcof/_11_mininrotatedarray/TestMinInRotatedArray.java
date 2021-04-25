package lcof._11_mininrotatedarray;

import org.junit.Assert;
import org.junit.Test;

public class TestMinInRotatedArray {
    @Test
    public void test() {
        MinInRotatedArray solution = new MinInRotatedArray();
        Assert.assertEquals(1, solution.minArray(new int[]{3, 4, 5, 1, 2}));
        Assert.assertEquals(0, solution.minArray(new int[]{2, 2, 2, 0, 1}));
        Assert.assertEquals(1, solution.minArray(new int[]{2, 1, 2, 2, 2}));
        Assert.assertEquals(1, solution.minArray(new int[]{2, 2, 2, 1, 2}));
        Assert.assertEquals(2, solution.minArray(new int[]{2, 3, 2, 2, 2}));
        Assert.assertEquals(2, solution.minArray(new int[]{2, 2, 2, 3, 2}));
    }
}
