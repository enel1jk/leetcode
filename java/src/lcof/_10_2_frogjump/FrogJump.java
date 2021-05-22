package lcof._10_2_frogjump;

/**
 *  * <a href="https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/">剑指 Offer 10- II. 青蛙跳台阶问题</a>
 */
public class FrogJump {
    public static class Solution1 {
        public int numWays(int n) {
            int a = 1, b = 2;
            int tmp;
            for (int i = 1; i < n; i++) {
                tmp = a + b;
                a = b;
                b = tmp;
            }
            return a;
        }
    }
}
