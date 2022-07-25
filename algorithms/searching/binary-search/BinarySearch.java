//https://leetcode.com/problems/binary-search/

class BinarySearch{
    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,12};
        System.out.println(binarySearch(nums, 9));
    }

    static int binarySearch(int [] nums, int k){
        
        int i = 0;
        int j = nums.length - 1;

        while(i <= j) {
            int mid = i + (j - i)/2;

            if(k < nums[mid]) j = mid - 1;
            else if(k > nums[mid]) i = mid + 1;
            else return mid;
        }
        
        return -1;
    }
}