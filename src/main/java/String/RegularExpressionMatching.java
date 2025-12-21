package String;// Leetcode 10. String.RegularExpressionMatching

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


public class RegularExpressionMatching {
    // s string, p pattern
    // a a, a *

    public boolean isMatch(String s, String p){
        if(p.isEmpty()){
            return s.isEmpty();
        }
        boolean firstMatch = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        if(p.length() > 1 && p.charAt(1) == '*'){
            return (firstMatch && isMatch(s.substring(1), p)) || (isMatch(s, p.substring(2)));
        }else{
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }
}