package lcof._5_replacespace;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceSpaceTest {
    @Test
    public void testReplaceSpace() {
        String s      = "We are happy.";
        String result = "We%20are%20happy.";

        Assert.assertEquals(new ReplaceSpace().replaceSpace(s), result);
    }
}
