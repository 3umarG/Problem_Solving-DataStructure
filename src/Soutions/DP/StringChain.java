package Soutions.DP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringChain {
    public static void main(String[] args) {
        String[] words = {"a", "b", "ba", "bca", "bda", "bdca"};
        String[] words2 = {"xbc","pcxbcf","xb","cxbc","pcxbc"};
        System.out.println(longestStrChain(words2));
    }

    public static int longestStrChain(String[] words) {
        // Sort
        Arrays.sort(words,(a,b)->Integer.compare(a.length(),b.length()));
        Map<String,Integer> map = new HashMap<>();
        int maxPred=1;
        for (String word:words){
            int pred=0;
            for (int i=0;i<word.length();i++){
                String sub=charRemoveAt(word,i);
                pred=Math.max(pred,map.getOrDefault(sub,0)+1);
            }
            map.put(word,pred);
            maxPred=Math.max(pred,maxPred);
        }
        return maxPred;
    }

    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }
}
