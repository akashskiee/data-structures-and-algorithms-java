//https://leetcode.com/problems/valid-perfect-square/

public class ValidPerfectSquare {
    public static void main(String[] args) {
        for(int i = 0; i<= 100; i++){
            if(isPerfectSquare(i)){
                System.out.println(i);
            }
        }
        
    }   
    static boolean isPerfectSquare(int num){
        if(num == 1) return true;
        int i = 1;
        int j = num / 2;
        int ans = 0;

        while(i <= j){
            int mid = i + (j - i)/2;
            int div = num / mid;

            if(div == mid){
                ans = div;
                break;
            }
            else if(div > mid) i = mid + 1;
            else j = mid - 1;

        }

        return ans * ans == num;
    } 
}
