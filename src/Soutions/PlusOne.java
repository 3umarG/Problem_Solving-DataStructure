package Soutions;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9,2,9};
        digits = plus(digits);
        System.out.println(Arrays.toString(digits));
    }

    public static int[] plus(int[] digits) {
        int n = digits.length;
        // 1 2 3
        // 1 2 4
        if (digits[n-1]!=9){
            digits[n-1]+=1;
            return digits;
        }
        else {
            // 9 9 9
            // 1 0 0 0
            if (digits[n-1]==9 && isAllNine(digits)){
                int[] newArr= new int[n+1];
                newArr[0]=1;
                for (int i = 1; i < newArr.length; i++) {
                    newArr[i]=0;
                }
                return newArr;
            }
            else {
                for (int i = n-1; i >=0 ; i--) {
                    if(digits[i]==9){
                        digits[i]=0;
                    }else {
                        digits[i]+=1;
                        break;
                    }
                }
                return digits;
            }
        }
    }

    public static boolean isAllNine(int[] arr){
        boolean isTrue= true;
        for (int j : arr) {
            if (j != 9) {
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }
}
