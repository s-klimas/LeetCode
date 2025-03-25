package pl.sebastianklimas.lc67AddBinary;

public class Solution {
    public String addBinary(String a, String b) {
        String longer = a.length() > b.length() ? a : b;
        String shorter = a.length() > b.length() ? b : a;
        int over = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= longer.length(); i++) {
            char lc = longer.charAt(longer.length() - i);
            if (i <= shorter.length()) {
                char sc = shorter.charAt(shorter.length() - i);
                if (lc == '1' && sc == '1') {
                    if (over == 0) {
                        result.insert(0, "0");
                        over = 1;
                    } else {
                        result.insert(0, "1");
                    }
                }
                else if ((lc == '0' && sc == '1') || (lc == '1' && sc == '0')) {
                    if (over == 0) {
                        result.insert(0, "1");
                    } else {
                        result.insert(0, "0");
                    }
                }
                else { // lc == 0 sc == 0
                    if (over == 0) {
                        result.insert(0, "0");
                    } else {
                        result.insert(0, "1");
                        over = 0;
                    }
                }
            } else {
                if (over == 1) {
                    if (lc == '0') {
                        result.insert(0, "1");
                        over = 0;
                    } else {
                        result.insert(0, "0");
                    }
                } else {
                    result.insert(0, lc);
                }
            }
        }
        if (over == 1) {
            result.insert(0, "1");
        }

        return result.toString();
    }
}
