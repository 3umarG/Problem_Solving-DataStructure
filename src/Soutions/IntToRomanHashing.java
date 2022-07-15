package Soutions;

import java.util.HashMap;
import java.util.Map;

public class IntToRomanHashing {
    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }

    public static String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        /*
        Symbol       Value
           I             1
           V             5
           X             10
           L             50
           C             100
           D             500
           M             1000


           * I can be placed before V (5) and X (10) to make 4 and 9.
           * X can be placed before L (50) and C (100) to make 40 and 90.
           * C can be placed before D (500) and M (1000) to make 400 and 900.

        {"M"  "CM"  "D"  "CD"  "C"  "XC"  "L"   "XL"  "X"  "IX"  "V"  "IV"  "I"};
        {1000  900  500  400   100   90    50    40   10    9     5    4    1};

        Because i can't access the index i put them in separated arrays and it takes the same O(n)
         */
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] integer = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int i = 0; i < integer.length; i++) {
            while (num>=integer[i]){
                num-=integer[i];
                res.append(romans[i]);
            }
        }
        return res.toString();
    }
}
