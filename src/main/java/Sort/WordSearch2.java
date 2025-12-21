package Sort;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


import java.util.LinkedList;
import java.util.List;
import Util.Utils;
import Util.TrieNode;

// Leetcode exercise 212. Word Search II
public class WordSearch2 {

    List<String> found;

    public List<String> findWords(char[][] board, String[] words) {
        found = new LinkedList<>();

        // we save the words in a trie for fast lookup
        TrieNode root = Utils.buildTrie(words);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                DFS(i, j, board, root);
            }
        }

        return found;
    }

    public void DFS(int i, int j, char[][] board, TrieNode r) {
        char c = board[i][j];

        if (board[i][j] == '#' || r.nodes[c - 'a'] == null) {
            return;
        }

        r = r.nodes[c - 'a'];

        if (r.word != null) {
            found.add(r.word);
            r.word = null; // we set the word as found
        }

        board[i][j] = '#';// we set the path as visited

        if (i - 1 >= 0)
            DFS(i - 1, j, board, r);
        if (i + 1 < board.length)
            DFS(i + 1, j, board, r);
        if (j - 1 >= 0)
            DFS(i, j - 1, board, r);
        if (j + 1 < board[0].length)
            DFS(i, j + 1, board, r);

        board[i][j] = c; // we set the value for future lookup
    }
}
