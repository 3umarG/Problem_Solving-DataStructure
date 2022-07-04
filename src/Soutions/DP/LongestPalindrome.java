package Soutions.DP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ababaccc"));
    }

    public static String longestPalindrome(String s) {
        // b a b a d
        String longestPal = "";
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            int l = i;
            int r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 >= maxLength) {
                    maxLength = r - l + 1;
                    longestPal = s.substring(l, r + 1);
                }
                l--;
                r++;
            }
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 >= maxLength) {
                    maxLength = r - l + 1;
                    longestPal = s.substring(l, r + 1);
                }
                l--;
                r++;
            }
        }
        return longestPal;
    }

    public static boolean isPalindrome(String s) {
        int n = s.length();
        // bab
        int p1 = 0;
        int p2 = s.length() - 1;
        while (p1 <= p2) {
            if (s.charAt(p1) != s.charAt(p2)) {
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}
