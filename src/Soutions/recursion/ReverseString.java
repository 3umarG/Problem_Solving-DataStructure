package Soutions.recursion;

public class ReverseString {
    public static void main(String[] args) {
        reverse(new char[]{'h','e','l','l','o'});
    }
    public static void reverse(char[] s){
        helper(s ,0);
        System.out.println(s);
    }

    // h e l l
    // l e l h
    public static void helper(char[] s , int count){
        if (count == (s.length) /2) return;
       swap(s,count,s.length-1-count);
        helper(s,count+1);
    }

    public static void swap(char[] s , int start ,int end){
        char chStart = s[start]; // h
        char chEnd = s[end]; // l
        s[start] = chEnd;
        s[end] = chStart;
    }
}
