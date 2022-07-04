package Soutions;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(2222));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int y = Math.abs(x);
        int dec = 0;
        while (y > 0) {
            dec = (dec * 10) + (y % 10);
            y /= 10;
        }

        return dec == x;

    }



}
