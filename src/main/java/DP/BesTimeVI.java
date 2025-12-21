package DP;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


/**
 @date: October 18, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/

 Space/Time Complexity:
 Space: O(n * m) and O(n) if 2 * k > prices.length
 Time: O(n * m) and O(n) if 2 * k > prices.length
 */

public class BesTimeVI {
    public int maxProfit(int k, int[] prices) {
        int l = prices.length;
        int sol = 0;
        if( l <= 0 || k <= 0){
            return 0;
        }

        //when 2k > l
        if( 2* k > l ){
            for(int i = 1; i < l; i++){
                sol += Math.max(0, prices[i] - prices[i - 1]);
            }
            return sol;
        }

        int[][][] memo = new int[l][k+1][2];

        for(int i = 0; i < l; i++){
            for(int j = 0; j <= k; j++){
                memo[i][j][0] = -1000000000;
                memo[i][j][1] = -1000000000;
            }
        }

        //base status
        memo[0][0][0] = 0;
        memo[0][1][1] = -prices[0];

        for(int i = 1; i < l; i++){
            for(int j = 0; j <= k; j++){
                //Keep not holdint the stock and selling
                memo[i][j][0] = Math.max(memo[i - 1][j][0], memo[i - 1][j][1] + prices[i]);
                if(j > 0){
                    memo[i][j][1] = Math.max(memo[i - 1][j][1], memo[i - 1][j - 1][0] - prices[i]);
                }
            }
        }

        for(int i = 0 ; i <= k; i++){
            sol = Math.max(sol, memo[l - 1][i][0]);
        }

        return sol;
    }
}
