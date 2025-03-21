package pl.sebastianklimas.lc58LengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
