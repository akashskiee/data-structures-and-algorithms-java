import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-target-indices-after-sorting-array/

public class TargetIndexSortedArray {
    public static void main(String[] args) {
        int [] nums = {1,2,5,2,3};
        System.out.println(targetIndices(nums, 2));
        
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);

        while(i <= j){
            int mid = i + (j - i)/2;

            if(nums[mid] == target) {
                ans.add(mid);
            } else if(nums[mid] < target) i = mid + 1;
            else {
                j = mid -1;
            }
        }


        return ans;
    }

}