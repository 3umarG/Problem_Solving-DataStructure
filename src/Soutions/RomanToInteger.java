package Soutions;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }


    public static int romanToInt(String s) {
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
    }

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