package binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void testSearch() {
        int[]        arr = new int[]{-1, 0, 3, 5, 9, 12};
        BinarySearch bs  = new BinarySearch();
        Assert.assertEquals(bs.search(arr, 9), 4);
        Assert.assertEquals(bs.search(arr, 2), -1);
    }
}