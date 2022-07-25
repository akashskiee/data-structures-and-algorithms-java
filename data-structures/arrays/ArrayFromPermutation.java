

//https://leetcode.com/problems/build-array-from-permutation/

/*

Brute Force Approch - 
    Create a new array ans of length of the given array
    Iterate through the array and add nums[nums[i]] to the new array

    Time Complexity - O(N) -> Using a for loop to iterate through the array of size N
    Space Complexity - O(N) -> Creating a new array from the input array of size N


Optimized Approach - 
    In the same array use the in-place array manipulation approach for each element
    Change the nums[i] using the formula a = r + bq, q > r and b !/ q (a = dividend, b = divisor, q = quotient and r = remainder)
    nums[i] = nums[i] + N * (nums[nums[i]] % N)

    Then divide the array elements by N
    nums[i] = nums[i] / N

    Time Complexity - O(N) -> Using 2 for loops separately to iterate the same N length array hence O(N) + O(N) = O(N)
    Space Complexity - O(1) -> Constant space complexity as we are not creating any separate array
 */

import java.util.Arrays;

public class ArrayFromPermutation{
    public static void main(String[] args) {
        int [] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    static int[] buildArray(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            nums[i] = nums[i] + n * (nums[nums[i]] % n);
        }
        for(int i = 0; i < n; i++){
            nums[i] = nums[i]/n;
        }

        return nums;
    }
}