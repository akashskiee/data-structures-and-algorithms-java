//https://leetcode.com/problems/max-consecutive-ones/

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int [] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
            } else {
                count = 0;
            }
            max = Math.max(count, max);
        }
        return max;
    }
}
