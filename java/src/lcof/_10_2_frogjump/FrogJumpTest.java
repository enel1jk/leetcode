package lcof._10_2_frogjump;

import org.junit.Assert;
import org.junit.Test;

public class FrogJumpTest {
    @Test
    public void test() {
        FrogJump.Solution1 solution1 = new FrogJump.Solution1();
        Assert.assertEquals(2, solution1.numWays(2));
        Assert.assertEquals(21, solution1.numWays(7));
        Assert.assertEquals(1, solution1.numWays(0));
    }
}
