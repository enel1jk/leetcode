package lcof._10_1_fib;

/**
 * <a href="https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/">剑指 Offer 10- I. 斐波那契数列</a>
 */
public class Fibonacci {

    public static class Solution1 {
        public int fib(int n) {
            int a = 0, b = 1;
            int tmp;
            for (int i = 0; i < n; i++) {
                tmp = a + b;
                a = b;
                b = tmp;
            }
            return a;
        }
    }

    public static class Solution2 {
        public int fib(int n) {
            if (n == 0) return 0;
            if (n == 1) return 1;
            return fib(--n) + fib(--n);
        }
    }

}
