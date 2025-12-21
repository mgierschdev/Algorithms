package Util;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


import java.util.*;

public class Checker implements Comparator<Player> {
    public int compare(Player a, Player b) {
        if(a.score == b.score){
            return a.name.compareTo(b.name);
        }else if(a.score < b.score){
            return 1;
        }else{
            return -1;
        }
    }
}
