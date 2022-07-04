package Soutions;


public class ValidPalindrome {
    // 65 - 122
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        boolean isTrue = true;
        for (int i = 0; i < s.length() / 2; i++) {
            // amanapla
            // 01234567
            // i == length-1-i
            // 0 == 7
            // 1 == 6
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }
}
