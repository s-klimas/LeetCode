package pl.sebastianklimas.lc14LongestCommonPrefix;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) { return ""; }
        if (strs.length == 1) { return strs[0]; }

        String longestPrefix = "";
        List<String> sorted = Arrays.stream(strs).sorted().toList();
        String firstWord = sorted.get(0);


        for (int i = 0; i <= firstWord.length(); i++) {
            for (int j = 1; j < sorted.size(); j++) {
                if (!sorted.get(j).startsWith(firstWord.substring(0, i))) {
                    return longestPrefix;
                }
            }
            longestPrefix = firstWord.substring(0, i);
        }
        return longestPrefix;
    }

    public String longestCommonPrefixMuchSimpler(String[] strs) {
        String prefix = strs[0];

        for(String str : strs) {
            while(!prefix.isEmpty() && !str.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}
