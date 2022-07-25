//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

public class CapacityToShip {
    public static void main(String[] args) {
        int [] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        System.out.println(shipWithinDays(weights, days));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int start = 0;
        int end = 0;
        
        for(int i = 0; i < weights.length; i++){
            start = Math.max(start, weights[i]);
            end += weights[i];
        }
        
        while(start < end){
            int mid = start + (end - start)/2;
            
            int sum = 0;
            int peices = 1;
            
            for(int weight : weights){
                if(weight + sum > mid){
                    sum = weight;
                    peices++;
                } else {
                    sum += weight;
                }
            }
            
            if(peices > days){
                start = mid + 1;
            } else {
                end = mid;
            }
            
        }
        return start;
    }
}