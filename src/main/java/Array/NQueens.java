package Array;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class NQueens {
    List<List<String>> result;
    HashSet<Integer> colSet;
    HashSet<Integer> diagonal1;
    HashSet<Integer> diagonal2;
    int size;

    public List<List<String>> solveNQueens(int n) {
        colSet = new HashSet<>();
        diagonal1 = new HashSet<>();
        diagonal2 = new HashSet<>();
        size = n;
        result = new LinkedList<>();
        addQueen(0, new LinkedList<>());

        return result;
    }

    private void addQueen(int row, List<String> rows) {

        if(row == size){
            result.add(new LinkedList<>(rows));
        }

        for(int col = 0; col < size; col++) {
            if(colSet.contains(col) || diagonal1.contains(row + col) || diagonal2.contains(row - col)){
                continue;
            }

            diagonal1.add(row + col);
            diagonal2.add(row - col);
            colSet.add(col);

            String[] currentRow = new String[size];
            Arrays.fill(currentRow, ".");
            currentRow[col] = "Q";
            rows.add(String.join("", currentRow));

            addQueen(row + 1, rows);

            rows.remove(rows.size() - 1);
            diagonal1.remove(row + col);
            diagonal2.remove(row - col);
            colSet.remove(col);
        }
    }
}

//        l.add(".Q..");
//        l.add("...Q");
//        l.add("Q...");
//        l.add("..Q.");

//        ll.add("..Q.");
//        ll.add("Q...");
//        ll.add("...Q");
//        ll.add(".Q..");