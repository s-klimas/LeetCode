package pl.sebastianklimas.lc69Sqrtx;

public class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        long i = 1;
        for (; i <= x / 2; i++) {
            if (i * i > x) {
                return (int) (i - 1);
            }
        }
        return (int) (i - 1);
    }
}
