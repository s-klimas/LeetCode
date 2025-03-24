package pl.sebastianklimas.lc66PlusOne;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] plusOne(int[] digits) {
        int over = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = digits.length - 1; i >= 0 || over > 0; i--) {
            if (i < 0) {
                list.add(over);
                over = 0;
            } else {
                int x = digits[i];
                if (i == digits.length - 1) {
                    x++;
                }
                if (x > 9) {
                    over++;
                    list.add(0);
                } else if (x == 9 && over > 0) {
                    list.add(0);
                    over = 1;
                } else {
                    list.add(x + over);
                    over = 0;
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = list.size() - 1; i >= 0; i--) {
            result[i] = list.get(list.size() - 1 - i);
        }
        return result;
    }
}
