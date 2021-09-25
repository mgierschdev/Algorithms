import java.util.HashMap;
import java.util.HashSet;

/**
 @date: October 11, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/maximal-network-rank/

 Space/Time Complexity:
 Space: O(n)
 Time: O(n * n)
 */

public class MaximalNetworkRank {
    class Pair{
        int a, b;
        public Pair(int a, int b){
            this.a = a;
            this.b = b;
        }
        public boolean equals(Object o){
            Pair p = (Pair)(o);
            return p.a == a && p.b == b;
        }
        public int hashCode(){
            Integer aa = Integer.valueOf(a);
            Integer bb = Integer.valueOf(b);
            return aa.hashCode() * 31 + bb.hashCode();
        }
    }

    public int maximalNetworkRank(int n, int[][] roads) {
        int max = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Pair> set = new HashSet<>();
        for(int i = 0; i < roads.length; i++){
            int x = roads[i][0];
            int y = roads[i][1];
            map.put(x, map.getOrDefault(x, 0) + 1);
            map.put(y, map.getOrDefault(y, 0) + 1);
            set.add(new Pair(x, y));
            set.add(new Pair(y, x));
        }
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(!map.containsKey(i) || !map.containsKey(j)){
                    continue;
                }
                int total =  map.get(i) + map.get(j);
                if(set.contains(new Pair(i, j))){
                    total--;
                }
                max = Math.max(max, total);
            }
        }
        return max;
    }
}
