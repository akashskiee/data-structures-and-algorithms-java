import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// CCI : Implement an algorithm to determine if a string has all unique characters.

class IsUnique {
  public static void main(String[] args) {
    String word = "abcdefga";
    System.out.println(isUnique(word));
  } 
  
  public static boolean isUnique(String word){

    Set<Character> chars = new HashSet<>();

   for (int i = 0; i < word.length(); i++) {
        if( chars.contains(word.charAt(i))){
            return false;
        } 
        chars.add(word.charAt(i));
        
   }


    return true;
  }
}