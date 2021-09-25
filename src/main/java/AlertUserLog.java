import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 @date: October 5, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/alert-using-same-key-card-three-or-more-times-in-a-one-hour-period/

 Space/Time Complexity:
 Space: O(n * m), the HashMap size * by the max number of times
 Time: O(n * m), the HashMap size * by the max number of times
 */

public class AlertUserLog {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        HashMap<String, LinkedList<Integer>> map = new HashMap<>();

        //map all times to their users
        for(int i = 0; i < keyName.length; i++){
            map.computeIfAbsent(keyName[i], g -> new LinkedList<>());
            map.get(keyName[i]).add(convertTime(keyTime[i]));
        }

        List<String> names = new LinkedList<>();

        for(String user : map.keySet()){
            LinkedList<Integer> times = map.get(user);
            Collections.sort(times);

            for(int i = 0; i + 2 < times.size(); i++){
                if(times.get(i + 2)  - times.get(i) <= 60){
                    names.add(user);
                    break;
                }
            }
        }

        Collections.sort(names);
        return names;
    }

    //to convert to it's relative min
    public int convertTime(String t){
        String[] arr = t.split(":");
        return Integer.valueOf(arr[1]) + (Integer.valueOf(arr[0])) * 60;
    }
}
