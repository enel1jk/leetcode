package binarysearch;

/**
 * <a href='https://leetcode-cn.com/problems/binary-search/'>二分查找</a>
 */
public class BinarySearch {
    public int search(int[] arr, int target) {
        if (arr == null) return -1;
        int l = 0;
        int r = arr.length - 1;
        int m;
        while (l <= r) {
            m = (l + r) / 2;
            if (target < arr[m]) {
                r = m - 1;
            } else if (target > arr[m]) {
                l = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
