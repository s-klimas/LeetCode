package pl.sebastianklimas.lc118PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;
        if (numRows >= 1) result.add(List.of(1));
        if (numRows >= 2) result.add(List.of(1, 1));
        if (numRows >= 3) result.add(List.of(1, 2, 1));

        for (int i = 4; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            row.add(i - 1);
            for (int j = 3; j <= i - 2; j++) {
                row.add(result.get(i - 2).get(j - 2) + result.get(i - 2).get(j - 1));
            }
            row.add(i - 1);
            row.add(1);
            result.add(row);
        }

        return result;
    }
}
