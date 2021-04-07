package sort;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/sort-an-array">数组排序</a>
 */
public class Sort {

    public int[] bubble(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    public int[] quick(int[] arr) {
        quick(arr, 0, arr.length - 1);
        return arr;
    }

    private void quick(int[] arr, int l, int r) {
        if (l < r) {
            int pivot = partition(arr, l, r);
            quick(arr, l, pivot - 1);
            quick(arr, pivot + 1, r);
        }
    }

    private int partition(int[] arr, int l, int r) {
        int pivot = arr[l];
        int cur   = l;
        for (int i = l + 1; i <= r; i++) {
            if (arr[i] < pivot) {
                cur++;
                swap(arr, i, cur);
            }
        }
        swap(arr, cur, l);
        return cur;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
