package Soutions;

import java.util.HashSet;
import java.util.Set;


public class ValidSodoku {

    public static void main(String[] args) {

    }

    public static boolean isValidSudoku(char[][] board) {
        //return validColumns(board) && validRows(board) && validSquare(board);
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char item=board[i][j];
                if (item=='.'){
                    continue;
                }
                // Row
                String s1="Row : "+i+" Value : "+item;
                // Column
                String s2="Column : "+j+" Value : "+item;
                // Small Matrix
                String s3="Matrix : "+i/3+" "+j/3+" Value : "+item;

                if (set.contains(s1)|| set.contains(s2)||set.contains(s3)){
                    return false;
                }
                else {
                    set.add(s1);
                    set.add(s2);
                    set.add(s3);
                }
            }
        }
        return true;
    }


//    public static boolean validRows(char[][] board) {
//        HashSet<Character> set;
//        for (int i = 0; i < 9; i++) {
//            set = new HashSet<>();
//            for (int j = 0; j < 9; j++) {
//                char item = board[i][j];
//                if (item == '.') {
//                    continue;
//                }
//                if (set.contains(item)) {
//                    return false;
//                } else {
//                    set.add(item);
//                }
//            }
//        }
//        return true;
//    }
//
//    public static boolean validColumns(char[][] board) {
//        HashSet<Character> set;
//        for (int i = 0; i < 9; i++) {
//            set = new HashSet<>();
//            for (int j = 0; j < 9; j++) {
//                char item = board[j][i];
//                if (item == '.') {
//                    continue;
//                }
//                if (set.contains(item)) {
//                    return false;
//                } else {
//                    set.add(item);
//                }
//            }
//        }
//        return true;
//    }
//
//    public static boolean validSquare(char[][] board) {
//        for (int mainRows = 0; mainRows < 9; mainRows += 3) {
//            for (int mainColumns = 0; mainColumns < 9; mainColumns += 3) {
//                HashSet<Character> set = new HashSet<>();
//                for (int subRow = mainRows; subRow < mainRows + 3; mainRows++) {
//                    for (int subCol = mainColumns; subCol < mainColumns + 3; subCol++) {
//                        if (set.contains(board[subRow][subCol]) && board[subRow][subCol] != '.')
//                            return false;
//                        else
//                            set.add(board[subRow][subCol]);
//                    }
//                }
//            }
//        }
//        return true;
//    }


}

