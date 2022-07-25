//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

public class SearchInRotatedArray2 {
    public static void main(String[] args) {
        int [] nums = {2,5,6,0,0,1,2};
        int target = 3;
        System.out.println(search(nums, target));
    }

    public static boolean search(int[] nums, int target) {
        int pivot = pivot(nums);
        
        int first = binarySearch(nums, target, 0, pivot);
        int second = binarySearch(nums, target, pivot + 1, nums.length - 1);
        
        if(first != -1){
            return true;
        } else return second != -1;
        
        
        
    }
    
    static int pivot(int [] nums){
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
            } else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])){
            start = mid + 1;    
            } else {
                end = mid - 1;
            }
            
        }
        return -1;
    }
    
    static int binarySearch(int [] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(target < nums[mid]) end = mid - 1;
            else if(target > nums[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }
    
}
