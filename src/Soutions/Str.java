package Soutions;

public class Str {
    public static void main(String[] args) {
        System.out.println(strStr("aaaaa","bba"));
    }

    public static int strStr(String haystack, String needle) {
        if(needle.isBlank()){
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.substring(i).indexOf(needle)==0){
                return i;
            }
        }
        return -1;
    }
}
