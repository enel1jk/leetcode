package lcof._9_cqueue;

import org.junit.Assert;
import org.junit.Test;

public class CQueueTest {

    @Test
    public void test() {
        CQueue q = new CQueue();
        q.appendTail(3);
        Assert.assertTrue(q.deleteHead() == 3 && q.deleteHead() == -1);

        q = new CQueue();
        Assert.assertTrue(q.deleteHead() == -1);
        q.appendTail(5);
        q.appendTail(2);
        Assert.assertTrue(q.deleteHead() == 5 && q.deleteHead() == 2);
    }
}
