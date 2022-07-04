package Soutions.ExcelSheet;

public class ExcelSheetFromStringToInt {
    public static void main(String[] args) {
        System.out.println(titleToNumber("bcd"));
        System.out.println(titleToNumber("aa"));
        System.out.println(titleToNumber("a"));
        System.out.println(titleToNumber("ab"));

    }

    public static int titleToNumber(String columnTitle){
        int result=0;
        for(int i=columnTitle.length()-1;i>=0;i--){
            int valueOfChar = columnTitle.toUpperCase().charAt(i)-'A'+1; // 4 3 2
            result+=valueOfChar*Math.pow(26,columnTitle.length()-i-1);
        }
        return result;
    }
}
