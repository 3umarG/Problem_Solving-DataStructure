package Soutions.HackerRankBasic;

public class FindSubString {
    public static void main(String[] args) {
        //System.out.println(isAllNotVowels("aghtf"));
        System.out.println(findSubString("rtfd", 3));

    }

    public static String findSubString(String s, int k) {
        StringBuilder res = new StringBuilder();
        // 1.All Char are Vowels
//        if (isAllVowels(s)) {
//            for (int i = 0; i < k; i++) {
//                res.append(s.charAt(i));
//            }
//            return res.toString();
//        }
        // 2.all char are not vowels
//        if (isAllNotVowels(s)) {
//            return "Not found!";
//        }
        if (!s.contains("a") && !s.contains("e") && !s.contains("i") && !s.contains("o") && !s.contains("u")) {
            return "Not found!";
        }

        // 3.worst case
        int index = 0;
        int maxVowels = 0;
        int numOfVowels;
        for (int i = 0; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            numOfVowels = 0;
            for (int j = 0; j < sub.length(); j++) {
                if (
                        sub.charAt(j) == 'a' ||
                                sub.charAt(j) == 'e' ||
                                sub.charAt(j) == 'i' ||
                                sub.charAt(j) == 'o' ||
                                sub.charAt(j) == 'u') {
                    numOfVowels++;
                }
            }
            if (numOfVowels > maxVowels) {
                maxVowels = numOfVowels;
                index = i;
            }
        }
        return s.substring(index, index + k);

    }

//    public static boolean isAllVowels(String s) {
//        for (int i = 0; i < s.length(); i++) {
//            // a e i o u
//            if (
//                    s.charAt(i) != 'a' &&
//                            s.charAt(i) != 'e' &&
//                            s.charAt(i) != 'i' &&
//                            s.charAt(i) != 'o' &&
//                            s.charAt(i) != 'u') {
//                return false;
//            }
//        }
//        return true;
//    }

    public static boolean isAllNotVowels(String s) {
        for (int i = 0; i < s.length(); i++) {
            // a e i o u
            if (
                    s.charAt(i) == 'a' ||
                            s.charAt(i) == 'e' ||
                            s.charAt(i) == 'i' ||
                            s.charAt(i) == 'o' ||
                            s.charAt(i) == 'u') {
                return false;
            }
        }
        return true;
    }
}
