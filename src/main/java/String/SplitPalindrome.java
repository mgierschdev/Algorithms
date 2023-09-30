package String;

/**
 @date: October 11, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/split-two-strings-to-make-palindrome/
 Other reference: https://leetcode.com/problems/split-two-strings-to-make-palindrome/discuss/888985/java-clean-on-with-explanations/728248

 Space/Time Complexity:
 Space: O(1)
 Time: O(n)
 */

public class SplitPalindrome {

    public boolean checkPalindromeFormation(String a, String b) {
        return validate(a,b) || validate(b,a);
    }

    private boolean validate(String a, String b) {
        int left = 0, right = a.length()-1;
        while (left < right) {
            if (a.charAt(left) != b.charAt(right))
                break;
            left++;
            right--;
        }

        return validate(a, left, right) || validate(b, left, right);
    }

    private boolean validate(String a, int left, int right) {
        while(left < right) {
            if (a.charAt(left) != a.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
