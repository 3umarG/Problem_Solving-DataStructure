package Soutions;


public class LengthOfLastWord {
    public static void main(String[] args) {
        int n=lengthOfLastWord("   ll    ");
        System.out.println(n);
    }

    public static int lengthOfLastWord(String s) {
        String[] arr = s.trim().split(" ");
        return arr[arr.length-1].length();
    }
}
