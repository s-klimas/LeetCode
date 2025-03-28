package pl.sebastianklimas.lc70ClimbingStairs;

public class Solution {
    public int fibonacci(int n) {
        if (n <= 2) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int fibonacciFaster(int n) {
        int current = 1;
        int after = 1;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = current;
            current = after;
            after = temp + after;
        }
        return current;
    }

    public int climbStairs(int n) {
        return fibonacciFaster(n);
    }
}
