//https://leetcode.com/problems/jewels-and-stones/

public class JewelsAndStones {
   public static void main(String[] args) {
    String jewels = "aA";
    String stones = "aAAbbbb";
   }

   public int numJewelsInStones(String jewels, String stones) {
    int count = 0;
    for(int i = 0; i < stones.length();i++ ){
        for(int j = 0; j < jewels.length(); j++){
            if(stones.charAt(i) == jewels.charAt(j)){
                count++;
            }
        }
    }
    return count;
}
}