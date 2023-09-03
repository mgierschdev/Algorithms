import java.util.HashMap;
/**
 @date: September 28, 2023
 @author: Maximiliam Gierschmann
 leetcode reference: https://leetcode.com/problems/kth-distinct-string-in-an-array/

 Space O(n), Time (n)

 : Strings
 */
public class kthDistinct {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();

        for(String str: arr){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for(int i = 0; i < arr.length; i++){
            if( map.get(arr[i]) == 1){
                k--;
                if(k == 0){
                    return arr[i];
                }
            }
        }

        return "";
    }
}
