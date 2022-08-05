import java.util.Arrays;

//Add an element to the array.

public class InsertIntoArray {
    public static void main(String[] args) {
        int [] arr = {2,3,5,6,7,8};
        int ele = 4;
        int pos = 2;
        int [] newArr = new int[arr.length + 1];

        

        for(int i = 0, j = 0; i < arr.length; i++, j++){
            if(i == pos){
                newArr[j] = ele;
                j++;
            }
            newArr[j] = arr[i];
        }

        System.out.println("Before insert " + Arrays.toString(arr));
        System.out.println("After insert " + Arrays.toString(newArr));
    }
}
