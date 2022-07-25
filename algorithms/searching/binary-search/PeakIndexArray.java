//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakIndexArray {
    
    public static void main(String[] args) {
        int [] arr = {0,1,2,1};
        System.out.println(peakIndexInMountainArray(arr));
    }


    public static int peakIndexInMountainArray(int [] nums){
        int i = 0;
        int j = nums.length - 1;
        int max = 0;

        while(i <= j){
            int mid = i +(j - i)/2;

            if(nums[mid] < nums[mid + 1]){
                max = mid + 1;
                i = mid + 1;
            } else {
                j = mid - 1;
            }

        }

        return max;
    }
}
