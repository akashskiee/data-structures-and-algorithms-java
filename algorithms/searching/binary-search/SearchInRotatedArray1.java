//https://leetcode.com/problems/search-in-rotated-sorted-array/

public class SearchInRotatedArray1 {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        
        int pivot = pivot(nums);
        
        if(pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        
        int first = binarySearch(nums, target, 0, pivot);
        
        if(first != -1){
            return first;
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
        
    }
    
    static int pivot(int [] nums){
        int i = 0;
        int j = nums.length - 1;
        
        while(i < j){
            int mid = i + (j - i)/2;
            
            if(mid < j && nums[mid] > nums[mid + 1]) return mid;
            
            if( mid > i && nums[mid] < nums[mid -1]) return mid - 1;
            
            if(nums[i] >= nums[mid]) j = mid -1;
            else i = mid + 1;
            
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
