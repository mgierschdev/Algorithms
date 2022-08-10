// 54. Leetcode Spiral matrix
import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> sol = new LinkedList<>();
        int layers = (matrix.length + 1) / 2;
        int numbers = matrix.length * matrix[0].length;
//        {1, 2, 3, 4, 5, 6},
//        {7, 8, 9, 10, 11, 12},
//        {13, 14, 15, 16, 17, 18}}
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}};

        for(int layer = 0; layer < layers; layer++){

            int n = matrix.length; // rows
            int m = matrix[0].length; // cols

            int side = n - layer - 1;
            int side2 = m - layer - 1;

            //up
            for(int i = layer; i <= side2; i++){
                sol.add(matrix[layer][i]);
                numbers--;
            }

            //right
            for(int j = layer + 1; j <= side; j++){
                sol.add(matrix[j][side2]);
                numbers--;
            }
            System.out.println(" "+numbers);

            if(numbers == 0){
                break;
            }

            //bot
            for(int x = side2 - 1; x >= layer ; x--){
                sol.add(matrix[side][x]);
                numbers--;
            }

            //left
            for(int y = side - 1; y >= layer + 1; y--){
                sol.add(matrix[y][layer]);
                numbers--;
            }
        }
        return sol;
    }
}