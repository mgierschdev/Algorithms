package Array;

import java.util.LinkedList;
import java.util.Queue;

public class ZeroOneMatrix {
    public int[][] calculate(int[][] mat){
        // left and top
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 0){
                    continue;
                }

                int top = mat.length +mat[0].length;
                int left = mat.length +mat[0].length;

                if(i - 1 >= 0){
                    top = mat[i - 1][j];
                }

                if(j - 1>= 0){
                    left =  mat[i][j - 1];
                }
                mat[i][j] = Math.min(top, left) + 1;
            }
        }
        // right and bottom
        for (int i = mat.length - 1; i >= 0; i--) {
            for (int j = mat[0].length -  1; j >= 0; j--) {
                if(mat[i][j] == 0){
                    continue;
                }

                int bot = mat.length +mat[0].length;
                int right = mat.length +mat[0].length;

                if(i + 1 < mat.length){
                    bot = mat[i + 1][j];
                }

                if(j + 1 < mat[0].length){
                    right = mat[i][j + 1];
                }
                mat[i][j] = Math.min(mat[i][j] ,Math.min(bot, right) + 1);
            }
        }

        return mat;
    }
    public int[][] calculateBFS(int[][] mat){
        //BFS
        Queue<Integer[]> queue = new LinkedList<>();

        // we add all zeros
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 0){
                    queue.add(new Integer[]{i, j});
                }else{
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }


        //4 directions
        int[][] directions = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};

        while(!queue.isEmpty()){
            Integer[] currentElement = queue.poll();

            for(int[] i : directions){
                int x = i[0] + currentElement[0];
                int y = i[1] + currentElement[1];

                // we skip if invalid
                if(x < 0 || y < 0 || x >= mat.length || y >= mat[0].length){
                    continue;
                }

                // 0, 0, 0
                // 0, 1, 0
                // 1, 1, 1

                // 0, 0, 0
                // 0, 1, 0
                // 1, 2, 1

                Integer[] neighbor = new Integer[]{x, y};

                if(mat[x][y]  > mat[currentElement[0]][currentElement[1]] + 1){
                    mat[x][y] = mat[currentElement[0]][currentElement[1]] + 1;
                    queue.add(neighbor);
                }
            }
        }
        return mat;
    }
}
