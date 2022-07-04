package Soutions;

public class RemovePal {
    public static void main(String[] args) {
//        int res=removePalindromeSub("baabb");
//        System.out.println(res);
        System.out.println(isPalindrome("aba"));
    }

    public static int removePalindromeSub(String s) {
        // بما ان عندك بس احتمالين من الحروف a-b
        // فبالتالي عندك 3 نواتج بس :
        // 0 لو كان ال String فاضي
        // 1 لو كان ال String هو اصلا Palindrome
        // 2 لو اكتر
        int p1 = 0;
        int p2 = s.length() - 1;
        int count = 1;
        while (p1 <= p2) {
            if (s.charAt(p1) != s.charAt(p2)) {
                count++;
            }
            p1++;
            p2--;
        }
        return Math.min(count, 2);
    }

    public static int removePalindromeSub2(String s) {
        if (isPalindrome(s)) {
            return 1;
        }
        return 2;
    }

    public static boolean isPalindrome(String s) {
        int p1 = 0, p2 = s.length() - 1;
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
