public class CountNegativeInMatrix {
    public static void main(String[] args) {
        int [][] grid = {{-1,-1}, {1,-1}};
        System.out.println(countNegatives(grid));
    }

    public static int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(grid[i][j] < 0) {
                    count += grid[i].length - j;
                    break;
                }
            }
            
        }
        
        return count;
    }
}
