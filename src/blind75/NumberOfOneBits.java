package blind75;

public class NumberOfOneBits {
    public static void main(String[] args) {

    }

    public static int hammingWeight(int n) {

        // O(32) = O(1)
        /*
        int counter = 0, mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) counter++;
            mask = mask << 1 ;
        }
        return counter;

         */


        // More Tricky Solution ...
        // O(number of Ones only)
        int counter = 0 ;
        while(n!=0){
            n = n & (n-1);
            counter ++;
        }
        return counter;
    }
}
