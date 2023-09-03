import java.util.LinkedList;
import java.util.List;

/**
 @date: September 28, 2023
 @author: Maximiliam Gierschmann
 leetcode reference: https://leetcode.com/problems/split-strings-by-separator/

 Space O(n), Time (n * m)

 Category: Strings, regex, scape characters in regex
 */

public class SplitWordsBySeparator {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new LinkedList<>();
        String sep = "\\"+Character.toString(separator);

        for(String sr : words){
            String[] strings = sr.split(sep);

            for(String ss : strings){
                if(ss.compareTo("") != 0){
                    result.add(ss);
                }
            }
        }

        return result;
    }
}
