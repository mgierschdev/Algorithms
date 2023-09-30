package Graph;

import Util.Utils;

import java.util.LinkedList;
import java.util.List;

public class PalindromePartition {

    List<List<String>> result;

    public List<List<String>> partition(String s) {
        result = new LinkedList<>();
        dfs(s, new LinkedList<>(), 0);
        return result;
    }

    public void dfs(String s, List<String> current, int index) {

        if (s.length() == 0) {
            result.add(new LinkedList<>(current));
            return;
        }

        for (int i = index; i < s.length(); i++) {

            String currentString = s.substring(0, i + 1);

            if (Utils.isPalindrome(currentString)) {
                current.add(currentString);
                String next = s.substring(i + 1);
                dfs(next, current, index);
                current.remove(current.size() - 1);
            }
        }
    }
}
