package Soutions.recursion;

public class KthSymbolGrammar {
    public static void main(String[] args) {
        System.out.println(kthGrammar(4, 5));
    }

    public static int kthGrammar(int row, int k) {
        // Base Case : First Row
        if (row == 1) return 0;

        // Trying to get the Parent Recursively
        int parent = kthGrammar(row - 1, (int) Math.ceil((double) k / 2));

        // The index of the child : even or odd to determine
        boolean isOdd = k % 2 == 1;

        if (parent == 1) {
            // 10
            return isOdd ? 1 : 0;
        } else {
            // 01
            return isOdd ? 0 : 1;
        }
    }


}
