import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindLongestWordInTheDictionary {

    public static void main(String[] args) {

        FindLongestWordInTheDictionary find = new FindLongestWordInTheDictionary();
        String[] str = {"w", "wo", "wor", "worl", "world", "worlb"};
        System.out.println(find.findLongestWord(str));

    }

    private String findLongestWord(String[] words){
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        String result = "";

        for(String word : words){

            if(word.length() == 1 || set.contains(word.substring(0, word.length() - 1))){
                 if(word.length() > result.length())
                     result = word;
                 set.add(word);
            }
        }
        return result;
    }
}
