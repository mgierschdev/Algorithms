import java.util.HashSet;

/**
 @date: September 27, 2023
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/keys-and-rooms/
 Problem: 841

 Category: Graphs , DFS, number of connected components

 Space/Time Complexity:
 Space: O(a)
 Time: O(nodes ^ branching factor)
 */
public class NumberOfProvinces {
    HashSet<Integer> visited;

    public int findCircleNum(int[][] isConnected) {
        visited = new HashSet<>();
        int components = 0;

        for(int i = 0; i < isConnected.length; i++){
            if(!visited.contains(i)){
                components++;
                dfs(isConnected, i);
            }
        }

        return components;
    }

    private void dfs(int[][] isConnected, int node){
        visited.add(node);

        // traverse ngb
        for(int i = 0; i < isConnected.length; i++){
            if(visited.contains(i) || isConnected[node][i] == 0){
                continue;
            }

            dfs(isConnected, i);
        }
    }
}
