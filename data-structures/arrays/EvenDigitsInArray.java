//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigitsInArray {
    public static void main(String[] args) {
        int [] nums = {12,3455,2,6,7896};
        System.out.println(findNumbers(nums));

    }

    public static int findNumbers(int[] nums) {
        int numCount = 0;
        
        for(int num : nums){
            if(findNoOfDigits(num) % 2 == 0){
                numCount++;
            }
        }
        return numCount;
    }
    
    public static int findNoOfDigits(int num){
        int count = 0;
        
        
        while(num != 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
