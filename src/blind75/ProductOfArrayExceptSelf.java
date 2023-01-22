package blind75;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

    }

    public static int[] productExceptSelf(int[] nums) {
        // 1 2 3 4
        int size = nums.length;

        int[] pre = new int[size];
        int[] post = new int[size];
        int[] res = new int[size];

        int product = 1;

        // The prefix array :
        // 0 1 2 6
        pre[0] = 0;
        for (int i = 1; i < size; i++) {
            product = product * nums[i - 1];
            pre[i] = product;
        }

        // The postfix array :
        // 24 12 4 0
        post[size - 1] = 0;
        product = 1;
        for (int i = size - 2; i >= 0; i--) {
            product = product * nums[i + 1];
            post[i] = product;
        }

        // The Final Result Array
        // pre  : 0   1 2 6
        // post : 24 12 4 0
        // final: 24 12 8 6
        // Sum the Bounds , and multiply the inside ...

        res[0] = post[0];
        res[size - 1] = pre[size - 1];
        for (int i = 1; i <= size - 2; i++) {
            res[i] = post[i] * pre[i];
        }
        return res;


    }
}
