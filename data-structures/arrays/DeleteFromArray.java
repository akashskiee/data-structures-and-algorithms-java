import java.util.Arrays;

//Delete an element from the array

public class DeleteFromArray {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8};
        int ele = 3;
        int pos = searchPos(arr, ele);

        System.out.println(Arrays.toString(deleteFromArray(arr, pos, ele)));
        

        
    }

    static int searchPos(int [] nums, int target){

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid  = start + (end - start)/2;
            if(nums[mid] > target) end = mid - 1;
            else if(nums[mid] < target) start = mid + 1;
            else return mid;
        }

        return -1;
    }

    static int [] deleteFromArray(int[] nums, int pos, int ele){
        int [] newArr = new int[nums.length - 1];

        for (int i = 0, j = 0; i < nums.length; i++) {
            if(i != pos){
                newArr[j] = nums[i];
                j++;
            }
        }

        return newArr;
    }



}
