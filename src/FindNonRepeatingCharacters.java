import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindNonRepeatingCharacters {

    public static void main(String[] args) {
        String str = "aaabczcdeebhcccsssstd";

        FindNonRepeatingCharacters find = new FindNonRepeatingCharacters();
        char firstNonRepeatingChar = find.fingNonRepeating(str);
        if(firstNonRepeatingChar != '_'){
            System.out.println("The first non repeating character in the array is : " + firstNonRepeatingChar);
        } else{
            System.out.println("There is no non repeating character in the array");
        }
    }

    private char fingNonRepeating(String str) {
        char[] arr = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<= arr.length - 1; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else{
                map.put(arr[i], 1);
            }

        }

        for(int i = 0; i<= arr.length - 1; i++){
            if(map.get(arr[i]) == 1){
                return arr[i];
            }
        }

       return '_';

    }
}
