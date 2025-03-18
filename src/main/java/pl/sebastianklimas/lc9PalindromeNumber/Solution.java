package pl.sebastianklimas.lc9PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
