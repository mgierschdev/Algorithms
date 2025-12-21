package DP;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


// Leetcode: 516. Longest Palindromic Subsequence
// https://leetcode.com/problems/longest-palindromic-subsequence/
public class LongestPalindromeSubsequence {
    public int longestPalindromeSubseq(String s) {

        char[] word = s.toCharArray();
        int[][] dp = new int[word.length][word.length];

        for(int i = 0; i < word.length; i++){
            dp[i][i] = 1;

            for(int j = i - 1 ; j >= 0; j--){
                if(word[i] == word[j]){
                    dp[i][j] = dp[i - 1][j + 1] + 2; // diagonal  up right
                }else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j + 1]); // top, right
                }
            }
        }
        return dp[word.length - 1][0];
    }
}
