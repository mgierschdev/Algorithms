package BitManipulation;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


/**
 @date: Sept 25, 2021
 @author: Maximiliam Gierschmann

 This counts the longest sequence of zeros in a binary string

 */

public class CountBitwise {

    public int count(int number){
        int result = Integer.MIN_VALUE;
        String binaryString = Integer.toBinaryString(number);
        String[] arrayOfZeros = binaryString.split("1");

        for(int i = 0; i < arrayOfZeros.length; i++){
            if(arrayOfZeros[i].length() > result){
                result = arrayOfZeros[i].length();
            }
        }

        return result == Integer.MIN_VALUE ? 0 : result;
    }
}
