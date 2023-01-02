package Soutions;

public class DetectCapital {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("leetcode"));
        System.out.println(detectCapitalUse("Google"));
        System.out.println(detectCapitalUse("FLaG"));
        System.out.println(detectCapitalUse("G"));
    }

    public static boolean detectCapitalUse(String word) {
        if (word.length() == 1) return true;

        // if the first character is small the rest of the string must be small letters
        if (Character.isLowerCase(word.charAt(0))) {
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) return false;
            }
        }
        // The first character is capital you have two options :
        // if the second letter is small the rest of string must be small
        // if the second letter is capital the rest of string must be capital
        else {
            boolean secondCharacterState = Character.isUpperCase(word.charAt(1));
            for (int i=2 ; i<word.length() ; i++){
                boolean currentCharacterState = Character.isUpperCase(word.charAt(i));
                if (currentCharacterState != secondCharacterState) return false;
            }

        }
        return true;
    }

    public static boolean allCapitals(String word) {
        String after = word.toUpperCase();
        return word.equals(after);
    }


    public static boolean allSmalls(String word) {
        String after = word.toLowerCase();
        return word.equals(after);
    }


    public static boolean firstCapital(String word) {
        return (word.charAt(0) >= 65 && word.charAt(0) <= 90) && allSmalls(word.substring(1));
    }
}
