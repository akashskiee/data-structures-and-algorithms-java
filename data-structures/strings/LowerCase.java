//https://leetcode.com/problems/to-lower-case/submissions/

import java.util.Arrays;

public class LowerCase {
    public static void main(String[] args) {
        String s = "AKASH";
        System.out.println(toLowerCase(s));

    }

    public static String toLowerCase(String s) {
        char [] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if((int) ch >= 65 && (int)ch <= 90) {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        System.out.println(Arrays.toString(chars));



       
        return new String(chars);
    }
}
