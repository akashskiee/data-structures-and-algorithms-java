//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

public class EqualStringArray {
    
    public static void main(String[] args) {
        String [] word1 = {"ab", "c"};
        String [] word2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       
        StringBuilder sb1 = new StringBuilder();

        for(int i = 0; i < word1.length; i++){
            sb1.append(word1[i]);
        }

        StringBuilder sb2 = new StringBuilder();

        for (int j = 0; j < word2.length; j++) {
            sb2.append(word2[j]);
        }

        return sb1.toString().equals(sb2.toString());
       
    }
}
