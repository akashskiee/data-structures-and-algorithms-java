import java.util.Arrays;

public class BinarySearchMatrix {
    public static void main(String[] args) {
        int [][] grid = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        System.out.println(Arrays.toString(binarySearchMatrix(grid, 18)));
        
    }

    static int [] binarySearchMatrix(int [][] grid, int target ){

        for (int i = 0; i < grid.length; i++) {
            int start = 0;
            int end = grid[i].length - 1;

            while(start < end){
                int mid = start + (end - start)/2;

                if(grid[i][mid] < target) start = mid + 1;
                else if(grid[i][mid] > target) end = mid - 1;
                else return new int []{i, mid};
            }

        }

        return new int[]{-1,-1};
    }
}
