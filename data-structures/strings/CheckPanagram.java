public class CheckPanagram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        
        for(char ch : alphabets.toCharArray()){
            if(sentence.indexOf(ch) == -1) return false;
        }
        return true;
}
    
}
