package lcof._4_findnumberin2darray;

import org.junit.Assert;
import org.junit.Test;

public class FindNumberIn2DArrayTest {
    @Test
    public void testFindNumberIn2DArray() {
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        Assert.assertTrue(new FindNumberIn2DArray().findNumberIn2DArray(matrix, 5));
        Assert.assertFalse(new FindNumberIn2DArray().findNumberIn2DArray(matrix, 20));
    }
}
