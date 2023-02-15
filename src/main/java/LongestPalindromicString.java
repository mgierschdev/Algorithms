// Leetcode problem 5.
// input = "babad", r = "bab"
// s = "cbbd", r = "bb"

public class LongestPalindromicString {
    String result;

    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }

        result = s.charAt(0) + "";
 
        for (int i = 0; i < s.length(); i++) {
            expand(i - 1, i + 1, s); // with mid, without mid
            expand(i, i + 1, s);
        }

        return result;
    }

    public void expand(int left, int right, String s) {
        if (left < 0 || right >= s.length()) {
            return;// new int[]{0, 0};
        }

        int[] result = new int[] { 0, 0 };

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            if (s.charAt(left) == s.charAt(right)) {
                result[0] = left;
                result[1] = right;
            }
            left--;
            right++;
        }

        // System.out.println(" "+ result[0] + " " + result[1]);

        if (result[0] != result[1]) {
            String current = s.substring(result[0], result[1] + 1);
            if (current.length() > this.result.length()) {
                this.result = current;
            }
        }
    }
}
