package Soutions.ExcelSheet;

public class ExcelSheetFromIntToString {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }

    public static String convertToTitle(int columnNumber) {
        // Decimal-----> Binary
        // هقسم واخد ال reminder
        //String s = Integer.toString(columnNumber);
        StringBuilder result = new StringBuilder();
        // 27
        int reminder;
        char c;
        while (columnNumber > 0) {
            columnNumber--;
            reminder = (columnNumber) % 26; //
            c = (char) (reminder + 'A');
            result.append(c);
            columnNumber = (columnNumber) / 26;
        }
        return result.reverse().toString();
    }
}
