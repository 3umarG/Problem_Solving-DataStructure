package blind75;

public class BitsReversed {
    public static void main(String[] args) {

    }

    public static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            // To get the current bit from right ...
            int singleBit = n & 1;

            // To Move it to the place that will be in when reversed ...
            singleBit = singleBit << (31 - i);

            // To add this bit to the result ...
            res = res | singleBit;

            // Move one bit right to get the next bit ...
            n = n >> 1;
        }
        return res;
    }
}
