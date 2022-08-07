//https://leetcode.com/problems/valid-perfect-square/

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(10));
    }

    static boolean isPerfectSquare(int num){
                if(num == 1) return true;
                int i = 1;
                int j = num/2;
                int ans = 0;
        
                while (i <= j){
                    int mid = i + (j - i)/2;
                    int div = num/mid;
        
        
                    if(div == mid) {
                        ans = mid;
                        break;
                    }
                    else if(div > mid) i = mid + 1;
                    else j = mid - 1;
        
                }
                return ans * ans == num;
            }

    
}
