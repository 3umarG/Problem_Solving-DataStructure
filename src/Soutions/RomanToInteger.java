package Soutions;

import java.util.Map;

import static java.util.Map.entry;


public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }


    public static int romanToInt(String s) {
       /*
        {"M"  "CM"  "D"  "CD"  "C"  "XC"  "L"   "XL"  "X"  "IX"  "V"  "IV"  "I"};
        {1000  900  500  400   100   90    50    40   10    9     5    4    1};
        */
        Map<String, Integer> map = Map.ofEntries(
                // MCMXCIV
                // length = 7
                // i <= 4
                // 1000
                entry("M", 1000),
                entry("CM", 900),
                entry("D", 500),
                entry("CD", 400),
                entry("C", 100),
                entry("XC", 90),
                entry("L", 50),
                entry("XL", 40),
                entry("X", 10),
                entry("IX", 9),
                entry("V", 5),
                entry("IV", 4),
                entry("I", 1)
        );
        int sum = 0;

        for (int i = 0; i < s.length(); ) {
            if (i <= s.length() - 2 && map.containsKey(s.substring(i, i + 2))) {
                sum += map.get(s.substring(i, i + 2));
                i += 2;
            } else {
                sum += map.get(Character.toString(s.charAt(i)));
                i++;
            }
        }
        return sum;
    }


    /*
    Another Solution Long
     int sum = 0;
        int i=0;
        while(i<s.length()){
            if (s.charAt(i) == 'I') {
                if(i<=s.length()-2){
                    if (s.charAt(i + 1) == 'V' ) {
                        //IV=4
                        sum += 4;
                        i+=2;
                    } else if (s.charAt(i + 1) == 'X') {
                        //IX=9
                        sum += 9;
                        i+=2;
                    }
                    else{
                        sum+=1;
                        i++;
                    }
                }
                else {
                    sum += 1;
                    i++;
                }
            }
            else if (s.charAt(i) == 'V') {
                sum += 5;
                i++;
            }
            else if (s.charAt(i) == 'X') {
                if(i<=s.length()-2){
                    if (s.charAt(i + 1) == 'L') {
                        sum += 40;
                        i+=2;
                    } else if (s.charAt(i + 1) == 'C') {
                        sum += 90;
                        i+=2;
                    }
                    else{
                        sum+=10;
                        i++;
                    }
                }
                else {
                    sum += 10;
                    i++;
                }
            }
            else if (s.charAt(i) == 'L') {
                sum += 50;
                i++;
            }
            else if (s.charAt(i) == 'C') {
                if(i<=s.length()-2){
                    if (s.charAt(i + 1) == 'D') {
                        sum += 400;
                        i+=2;
                    } else if (s.charAt(i + 1) == 'M') {
                        sum += 900;
                        i+=2;
                    }else{
                        sum+=100;
                        i++;
                    }
                }
                else {
                    sum += 100;
                    i++;
                }
            }
            else if (s.charAt(i) == 'D') {
                sum += 500;
                i++;
            }
            else if (s.charAt(i) == 'M') {
                sum += 1000;
                i++;
            }
        }

        return sum;
     */

}

/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */