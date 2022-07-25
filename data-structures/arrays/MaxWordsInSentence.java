//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

public class MaxWordsInSentence {
    public static void main(String[] args) {
        String [] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
       
    }
    public static int mostWordsFound(String[] sentences) {
        int mostWords = 0;

        for (int i = 0; i < sentences.length; i++) {
            int words = 1;
            for (int j = 0; j < sentences[i].length(); j++) {
                char c = sentences[i].charAt(j);
                if(c == ' ') words++;
            }
            if (mostWords < words) mostWords = words;
        }


        return mostWords;
    }

    }
    

