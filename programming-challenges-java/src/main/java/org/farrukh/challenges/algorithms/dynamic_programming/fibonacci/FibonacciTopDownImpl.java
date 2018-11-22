package org.farrukh.challenges.algorithms.dynamic_programming.fibonacci;

/**
 * Top-Down approach (aka Memoization)
 */
public class FibonacciTopDownImpl implements Fibonacci {

    long[] memo;

    public FibonacciTopDownImpl(int max) {
        int large = 10 * max;
        this.memo = new long[large];
        for (int i = 0; i < large; i++) {
            memo[i] = -1;
        }
    }

    @Override
    public long fibo(int n) {
        if (memo[n] == -1) {
            if (n <= 1)
                memo[n] = n;
            else
                memo[n] = fibo(n - 1) + fibo(n - 2);
        }
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 10;

        Fibonacci topDownSolution = new FibonacciTopDownImpl(n);

        long fibo = topDownSolution.fibo(n);
        System.out.printf("Fibonacci for %s is %s", n, fibo);

        assert fibo == 55;
    }

}
