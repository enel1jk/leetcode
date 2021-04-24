package lcof._10_1_fib;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    @Test
    public void testSolution1() {
        Fibonacci.Solution1 solution1 = new Fibonacci.Solution1();
        Assert.assertEquals(1, solution1.fib(2));
        Assert.assertEquals(5, solution1.fib(5));
    }

    @Test
    public void testSolution2() {
        Fibonacci.Solution2 solution2 = new Fibonacci.Solution2();
        Assert.assertEquals(1, solution2.fib(2));
        Assert.assertEquals(5, solution2.fib(5));
    }
}
