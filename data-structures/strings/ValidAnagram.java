import java.util.HashMap;

//https://leetcode.com/problems/valid-anagram/

/*
 
 */

public class ValidAnagram {
    
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> str1 = new HashMap<>();
        HashMap<Character, Integer> str2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            //add to first hashmap
            char cs = s.charAt(i);
            if(str1.containsKey(cs)){
                str1.put(cs, str1.get(cs) + 1);
            } else {
                str1.put(cs, 1);
            }
            //add to second hashmap
            char ct = t.charAt(i);
            if(str2.containsKey(ct)){
                str2.put(ct, str2.get(ct) + 1);
            } else {
                str2.put(ct, 1);
            }
        }

        
        return str1.equals(str2);
    }
}
