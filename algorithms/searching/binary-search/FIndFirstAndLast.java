//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FIndFirstAndLast {
    public static void main(String[] args) {
        int [] nums = {5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString( searchRange(nums, target)));
    }
    static int[] searchRange(int[] nums, int target) {
        int [] ans = {-1, -1};

        int first = findPosition(nums, target, true);

        if(first != -1){
            ans[0] = first;
            ans[1] = findPosition(nums, target, false);
        }

        return ans;
    }

    static int findPosition(int [] nums, int target, boolean isStart){
        int i = 0;
        int j = nums.length - 1;
        int ans = -1;

        while (i <= j) {
            int mid = i + (j - i)/2;

            if(target < nums[mid]) j = mid - 1;
            else if(target > nums[mid]) i = mid + 1;
            else {
                ans = mid;
                if(isStart){
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }


        }
        return ans;
    }
}
