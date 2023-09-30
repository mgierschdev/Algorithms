package Array;

//Leetcode problem 59
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {

        int layers = (n + 1) / 2;
        int[][] matrix = new int[n][n];
        int count = 1; // to assign the value

        for(int layer = 0; layer < layers; layer++){

            int side = n - layer - 1;

            //up
            for(int i = layer; i <= side; i++){
                matrix[layer][i] = count++;
            }

            //right
            for(int j = layer + 1; j <= side; j++){
                matrix[j][side] = count++;
            }

            //bot
            for(int x = side - 1; x >= layer ; x--){
                matrix[side][x] = count++;
            }

            //left
            for(int y = side - 1; y >= layer + 1; y--){
                matrix[y][layer] = count++;
            }
        }

        return matrix;
    }
}
