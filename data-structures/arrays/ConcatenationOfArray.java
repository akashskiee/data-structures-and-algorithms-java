import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/

/*
Algorithm - 
    Create an array of 2X Size of the initial array, Interate through the initial array, assign the ith and n+ith element to i

    Time Complexity - O(N) - We are iterating through the array of size N
    Space Complexity - O(N) - We are creating a new array of size 2 * N
  
 */

public class ConcatenationOfArray {
public static void main(String[] args) {
    int [] nums = {1,2,1};
    System.out.println(Arrays.toString(getConcatenation(nums)));
}    

static  int[] getConcatenation(int[] nums) {
    int n = nums.length;
    int [] newArray = new int[2 * n];
    for(int i = 0; i < n; i++){
        newArray[i] = nums[i];
        newArray[n + i] = nums[i];
    }
    return newArray;
}

}
