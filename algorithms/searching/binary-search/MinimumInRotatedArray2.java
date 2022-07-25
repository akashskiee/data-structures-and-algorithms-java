//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

public class MinimumInRotatedArray2 {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,2,4};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        
        int pivot = pivot(nums);
        
        if(pivot == -1) return nums[0];
        else {
            return nums[pivot + 1];
        }
        
    }

    public static int pivot(int [] nums){
        int start = 0;
        int end = nums.length - 1;
        
        while(start < end){
            int mid = start + (end - start)/2;
            
            if(mid < end && nums[mid] > nums[mid + 1]) return mid;
            
            if(mid > start && nums[mid] < nums[mid - 1]) return mid - 1;
            
            if(nums[start] == nums[mid] && nums[end] == nums[mid]){
                if(nums[start] > nums[start + 1]) return start;
                start++;
                if(nums[end] < nums[end - 1]) return end - 1;
                end--;
            } else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
                
            } else {
                end = mid - 1;
            }
        }
        return -1;
        }
}
