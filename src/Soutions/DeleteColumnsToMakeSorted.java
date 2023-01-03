package Soutions;

public class DeleteColumnsToMakeSorted {
    public static void main(String[] args) {

        String[] s = {"a","b"};
        System.out.println(minDeletionSize(s));
    }

    public static int minDeletionSize(String[] strs) {
        int arrLength = strs.length;
        int singleStrLength = strs[0].length();

        // Sorted
        if (arrLength < 2) return 0;


        int res = 0;
        for (int i = 0; i < singleStrLength; i++) {
            for (int j = 0; j < arrLength-1; j++) {
                if (strs[j].charAt(i) > strs[j+1].charAt(i)){
                    res++;
                    break;
                }
            }
        }

        return res;
    }
}
