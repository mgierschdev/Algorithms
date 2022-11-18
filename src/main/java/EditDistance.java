/**
 * @date: October 1, 2020
 * @author: Maximiliam Gierschmann
 * Leetcode reference: https://leetcode.com/problems/edit-distance/
 * <p>
 * This is an adaptation of the Levenshtein distance algorithm by Steven S. Skienna, rewritten in java. Which allows this same algorithm to be modified
 * for other use cases.
 * <p>
 * Reference: https://en.wikipedia.org/wiki/Levenshtein_distance
 * <p>
 * Space/Time Complexity:
 * Space: O(m*n): where n and m are the sizes of word1 and word2 + 1, in order to store the results in the DP matrix
 * Time: O(m*n): where n and m are the sizes of word1 and word2 + 1, we need to iterate at least once per matrix position
 */

public class EditDistance {
    // We have a different structure so we can store the parent and the cost
    class Cell {
        int cost, parent;

        public Cell(int cost, int parent) {
            this.cost = cost;
            this.parent = parent;
        }
    }

    // In order to init the first row/col of the DP matrix
    private void initColRow(Cell[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = new Cell(0, 0);
            }
        }

        //init first col
        for (int i = 0; i < m.length; i++) {
            m[i][0].cost = i;
            if (i > 0) {
                m[i][0].parent = 1;
            } else {
                m[i][0].parent = -1;
            }
        }

        //init first row
        for (int i = 0; i < m[0].length; i++) {
            m[0][i].cost = i;
            if (i > 0) {
                m[0][i].parent = 1;
            } else {
                m[0][i].parent = -1;
            }
        }
    }

    // So we can adapt the cost to other cases
    private int match(char a, char b) {
        if (a == b) {
            return 0;
        } else {
            return 1;
        }
    }

    // So we can adapt the cost to other cases
    private int inDelRep() {
        return 1;
    }

    // If case we want to output the matrix construction on console
    private void printMatrix(Cell[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j].cost + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Calculates the min edit distance
    public int minDistance(String word1, String word2) {
        Cell[][] memo = new Cell[word1.length() + 1][word2.length() + 1];
        int i, j, k;
        int[] opt = new int[3];//Cost of insert/delete/replace
        initColRow(memo);

        for (i = 1; i <= word1.length(); i++) {
            for (j = 1; j <= word2.length(); j++) {

                opt[0] = memo[i - 1][j - 1].cost + match(word1.charAt(i - 1), word2.charAt(j - 1)); //opt[0] match
                opt[1] = memo[i][j - 1].cost + inDelRep(); //opt[1] Insert
                opt[2] = memo[i - 1][j].cost + inDelRep(); //opt[2] delete

                memo[i][j].cost = opt[0];
                memo[i][j].parent = 0;

                for (k = 0; k <= 2; k++) {
                    if (opt[k] < memo[i][j].cost) {
                        memo[i][j].cost = opt[k];
                        memo[i][j].parent = k;
                    }
                }
            }
            printMatrix(memo);
        }

        //Returning the result
        return memo[memo.length - 1][memo[0].length - 1].cost;
    }

    public int minDistanceRecursive(String a, String b) {
        if(a.length() == b.length() && a.compareTo(b) != 0 && a.length() == 1){
            return 1;
        }
        int result = compareRecursive(a, b, a.length() - 1, b.length() - 1);
        return Math.max(result, 0);
    }

    private int compareRecursive(String a, String b, int i, int j) {
        int[] opt = new int[3];//cost of each operation match/insert/delete

        if(i <= 0){
            return j;
        }

        if(j <= 0){
            return i;
        }

        if(a.charAt(i - 1) == b.charAt(j - 1)){
            return compareRecursive(a, b, i - 1, j - 1);
        }

        opt[0] = compareRecursive(a, b, i - 1, j - 1);
        opt[1] = compareRecursive(a, b, i, j - 1);
        opt[2] = compareRecursive(a, b, i - 1, j);

        return 1 + Math.min(Math.min(opt[0], opt[1]), opt[2]);
    }
}