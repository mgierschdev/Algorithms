package Array;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


public class ContainerWithMostWater {

    public int calculate(int[] h){
        int[] leftMax = new int[2];
        int[] rightMax = new int[2];
        int left = 0;
        int right = h.length - 1;

        while(left < right){

            int large = right - left;
            int leftH = h[left];
            int rightH = h[right];
            int localMax = Math.min(leftH, rightH) * large;

            if(localMax > leftMax[0] || localMax > rightMax[0]){
                leftMax[0] = localMax;
                leftMax[1] = left;
                rightMax[0] = localMax;
                rightMax[1] = right;
            }

            if(leftH <= rightH){
                left++;
            }else{
                right--;
            }
        }

        return Math.max(rightMax[0], leftMax[0]);
    }
}
