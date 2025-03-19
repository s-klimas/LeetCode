package pl.sebastianklimas.lc20ValidParentheses;

import java.util.Map;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<String> expected = new Stack<>();
        Map<Character, String> map = Map.of(
                '(', ")",
                '[', "]",
                '{', "}"
        );
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                expected.push(map.get(c));
            } else if (c == ')' || c == '}' || c == ']') {
                if (!expected.isEmpty() && expected.peek().equals(String.valueOf(c))) {
                    expected.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return expected.isEmpty();
    }
}
