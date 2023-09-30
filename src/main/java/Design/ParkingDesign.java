package Design;

/**
 @date: October 3, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/design-parking-system/

 Space/Time Complexity:
 Space: O(1)
 Time: O(1)
 */

public class ParkingDesign {
    int[] capacity = new int[3];

    public ParkingDesign(int big, int medium, int small) {
        capacity[0] = small;
        capacity[1] = medium;
        capacity[2] = big;
    }

    public boolean addCar(int carType) {
        if(carType == 3 && capacity[0] != 0){//3 == small, capacity[0]
            capacity[0]--;
            return true;
        }else if(carType == 3 && capacity[0] == 0){//3 == small, capacity[0]
            return false;
        }else if(carType == 2 && capacity[1] != 0){//2 == medium, capacity[1]
            capacity[1]--;
            return true;
        }else if(carType == 2 && capacity[1] == 0){//2 == medium, capacity[1]
            return false;
        }else if(carType == 1 && capacity[2] != 0){//1 == big, capacity[2]
            capacity[2]--;
            return true;
        }else{
            return false;
        }
    }
}
