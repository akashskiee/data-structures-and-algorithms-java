import java.util.Arrays;

public class SumOfArrayExceptItSelf{
    public static void main(String[] args) {
       int [] nums = {1,2,3,4};

       int [] left = new int[nums.length];
       int [] prod = new int[4];
       left[0] = 1;
       int [] right = new int[nums.length];
        right[nums.length - 1] = 1;
       for(int i = 1; i < nums.length; i++){
        left[i] = nums[i- 1] * left[i - 1];
       }
       for(int j = nums.length - 2; j >= 0; j--){
        right[j] = nums[j + 1] * right[j+1];
       }

       for(int k = 0; k < nums.length; k++){
        prod[k] = left[k] * right[k];
       }

       System.out.println(Arrays.toString(prod));


       
    }    
}