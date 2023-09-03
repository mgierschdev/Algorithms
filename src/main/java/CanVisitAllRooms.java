import java.util.HashSet;
import java.util.List;

/**
 @date: September 27, 2023
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/keys-and-rooms/
 Problem: 841

 Category: Graphs , DFS

 Space/Time Complexity:
 Space: O(a)
 Time: O(nodes ^ branching factor)
 */
public class CanVisitAllRooms {
    private HashSet<Integer> visited;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new HashSet<>();
        dfs(rooms, 0);

        return visited.size() == rooms.size();
    }

    public void dfs(List<List<Integer>> rooms, int room){
        if(visited.contains(room)){
            return;
        }

        visited.add(room);
        List<Integer> ngb = rooms.get(room);

        for(int i : ngb){
            if(visited.contains(i)){
                continue;
            }

            dfs(rooms, i);
        }
    }
}
