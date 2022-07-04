package Soutions.HackerRankBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRanke {
    public static void main(String[] args) {
        List<String> usernames = new ArrayList<String>();
        usernames.add("bee");
        usernames.add("superhero");
        usernames.add("ace");
        List<String> result = getResult(usernames);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<String> getResult(List<String> usernames) {
        List<String> results = new ArrayList<String>();
        boolean isTrue = false;
        // [bee , superhero , ace ]
        loop:
        for (String name : usernames) {
            // bee
            for (int j = 0; j < name.length() - 1; j++) {
                for (int k = j + 1; k < name.length(); k++) {
                    if (name.charAt(j) > name.charAt(k)) {
                        results.add("YES");
                        continue loop;
                    }
                }
            }
            results.add("NO");
        }
        return results;
    }
}
