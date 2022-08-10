// 54. Leetcode Spiral matrix
import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> sol = new LinkedList<>();
        int layers = (matrix.length + 1) / 2;

//        int[][] matrix =new int[][]{

//        {1, 2, 3, 4, 5, 6},
//        {7, 8, 9, 10, 11, 12},
//        {13, 14, 15, 16, 17, 18}};

        for(int layer = 0; layer < layers; layer++){
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}};

            int n = matrix.length; // rows
            int m = matrix[0].length; // cols

            System.out.println("Layer "+layer);

            //top
            for(int i = 0; i < m - 1; i++){
                System.out.print(matrix[layer][i]+" ");
            }
            System.out.println(" ");

            //right
            for (int i = layer; i < n - layer; i++) {
                System.out.print(matrix[i][m - 1 - layer] + " ");
            }
            System.out.println(" ");

            //bot
            for(int i = m - layer - 2; i >= 0; i--){
                System.out.print(matrix[m - layer - 1][i] + " ");
            }
            System.out.println(" ");

            //left
            for (int i = n - 2 - layer; i > layer - 1; i--) {
                //System.out.println("i "+i+" "+layer);
                System.out.print(matrix[i][layer]+ " left ");
            }

            System.out.println(" ");
        }

        return new LinkedList<>();
    }
}
