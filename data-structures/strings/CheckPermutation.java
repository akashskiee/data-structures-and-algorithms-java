//CCI : Given 2 strings, write a method to decide if one is a permutation of other

import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {
    public static void main(String[] args) {
        String word1 = "akash";
        String word2 = "kaash";
        System.out.println(checkPermutation(word1, word2));
    }

    public static boolean checkPermutation(String word1, String word2){

        if(word1.length() != word2.length()){
            return false;
        }

        Map<Character, Integer> chars1 = new HashMap<>();
        Map<Character, Integer> chars2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            char ch1 = word1.charAt(i);
            if(chars1.containsKey(ch1)){
                chars1.put(ch1, chars1.get(ch1) + 1);
            } else {
                chars1.put(ch1, 1);
            }

            char ch2 = word2.charAt(i);
            if(chars2.containsKey(ch2)){
                chars2.put(ch2, chars2.get(ch2) + 1);
            } else {
                chars2.put(ch2, 1);
            }
        }

        

       
        



        return chars1.equals(chars2);
    }
}
