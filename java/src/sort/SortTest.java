package sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortTest {
    private int[][] data;
    private Sort    sort;

    @Before
    public void setup() {
        sort = new Sort();
        data = new int[][]{
                {5, 2, 3, 1}, {1, 2, 3, 5},
                {5, 1, 1, 2, 0, 0}, {0, 0, 1, 1, 2, 5}
        };
    }

    @Test
    public void testBubble() {
        for (int i = 0; i < data.length; i += 2) {
            Assert.assertArrayEquals(sort.bubble(data[i]), data[i + 1]);
        }
    }

    @Test
    public void testQuick() {
        for (int i = 0; i < data.length; i += 2) {
            Assert.assertArrayEquals(sort.quick(data[i]), data[i + 1]);
        }
    }
}
