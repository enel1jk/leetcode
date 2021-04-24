package lcof._10_2_frogjump;

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
