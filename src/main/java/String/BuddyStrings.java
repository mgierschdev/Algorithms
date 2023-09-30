package String;

/**
 @date: October 12, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/buddy-strings/

 Space/Time Complexity:
 Space: O(1)
 Time: O(n)
 */
public class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        if(A.length() != B.length() || A.length() <= 1 && B.length() <= 1){
            return false;
        }

        char[] wordA = A.toCharArray();
        char[] wordB = B.toCharArray();

        int[] map = new int[26];
        int count = 0, i = -1, maxCharCount = 0;

        for(int k = 0; k < wordA.length; k++){
            map[wordA[k] - 'a']++;
            maxCharCount = Math.max(maxCharCount, map[wordA[k] - 'a']);

            if(wordA[k] != wordB[k]){
                count++;
                if(count == 1) i = k;

                if(count > 1 && (wordA[k] != wordB[i] || wordB[k] != wordA[i])){
                    return false;
                }
            }
        }

        if(i == -1 && (maxCharCount > 1 && count == 0) || count == 2){
            return true;
        }

        return false;
    }
}
