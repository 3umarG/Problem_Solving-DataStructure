package Soutions;

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        /*
        ** This Solution by using two for loop ===> O(N)

        String[] split = s.split(" ");

        // First Test Case
        if (pattern.length() != split.length) {
            return false;
        }

        int size = pattern.length();

        // The Pattern & string are equal in length ...
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (map.containsValue(split[i]) && !map.containsKey(pattern.charAt(i))) {
                return false;
            }
            map.put(pattern.charAt(i), split[i]);
        }

        String res = "";
        for (int i = 0; i < size; i++) {
            res += map.get(pattern.charAt(i)) + " ";
        }

        return res.trim().equals(s);

         */

        // Another Solution with One for loo ===> O(N)
        String[] split = s.split(" ");
        if (split.length != pattern.length()) return false;
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            boolean containsKey = map.containsKey(ch);
            // If the map has the value , but in another key ===> False
            if (map.containsValue(split[i]) && !containsKey) {
                return false;
            }

            // If the word is not match with the split ...
            if (containsKey && !map.get(ch).equals(split[i])){
                return false;
            }

            map.put(ch, split[i]);
        }
        return true;
    }
}
