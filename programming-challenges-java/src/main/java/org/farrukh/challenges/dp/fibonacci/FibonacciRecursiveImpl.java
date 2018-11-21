package org.farrukh.challenges.dp.fibonacci;

public class FibonacciRecursiveImpl implements Fibonacci {

    @Override
    public long fibo(int n) {

        if (n <= 1)
            return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {

    }
}
