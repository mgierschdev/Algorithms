package DP;//Leetcode: 1143. Longest Common Subsequence
// https://leetcode.com/problems/longest-common-subsequence/

import Util.Utils;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String word1, String word2) {

        char[] a = word1.toCharArray();
        char[] b = word2.toCharArray();
        int[][] dp = new int[a.length + 1][b.length + 1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {

                if (a[i - 1] == b[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                Utils.printMatrix(dp);
            }
        }
        return dp[a.length][b.length];
    }
}
