package Soutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhone {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(letterCombinations("23").toArray()));
    }

    public static List<String> letterCombinations(String digits) {
        //        The First Solution
//        List<String> list = null;
//        if (digits.length() == 0) {
//            return List.of();
//        } else if (digits.length() == 1) {
//            list = map.get(digits);
//        } else if (digits.length() == 2) {
//            list = twoDigits(map.get(Character.toString(digits.charAt(0))), map.get(Character.toString(digits.charAt(1))));
//        } else if (digits.length() == 3) {
//            list = threeDigits(map.get(Character.toString(digits.charAt(0))), map.get(Character.toString(digits.charAt(1))), map.get(Character.toString(digits.charAt(2))));
//        } else if (digits.length() == 4) {
//            list = fourDigits(map.get(Character.toString(digits.charAt(0))), map.get(Character.toString(digits.charAt(1))), map.get(Character.toString(digits.charAt(2))),map.get(Character.toString(digits.charAt(3))));
//        }
//        return list;
        Map<String, List<String>> map = Map.ofEntries(
                Map.entry("2", List.of("a", "b", "c")),
                Map.entry("3", List.of("d", "e", "f")),
                Map.entry("4", List.of("g", "h", "i")),
                Map.entry("5", List.of("j", "k", "l")),
                Map.entry("6", List.of("m", "n", "o")),
                Map.entry("7", List.of("p", "q", "r", "s")),
                Map.entry("8", List.of("t", "u", "v")),
                Map.entry("9", List.of("w", "x", "y", "z"))
        );
        if (digits.length()==0){
            return List.of();
        }
        List<String> result = new LinkedList<>();
        backTrackingFun(0,new StringBuilder().append(""),digits,result,map);
        return result;



    }

    public static void backTrackingFun(int index , StringBuilder combination , String digits , List<String> result ,Map<String, List<String>> map){

        if (index>digits.length()){
            return;
        }
        if (combination.length()==digits.length()){
            result.add(combination.toString());
            return;
        }
        // 23
        String currentKeyIndex = Character.toString(digits.charAt(index)); // 2
        List<String> characters  = map.get(currentKeyIndex); //  a b c
        for (String s : characters){
            backTrackingFun(index+1,new StringBuilder(combination).append(s),digits,result,map);
        }


    }

    public static List<String> twoDigits(List<String> list1, List<String> list2) {
        List<String> l = new LinkedList<>();
        for (String s : list1) {
            for (String s2 : list2) {
                l.add(s + s2);
            }
        }
        return l;
    }

    public static List<String> threeDigits(List<String> list1, List<String> list2, List<String> list3) {
        List<String> l = new LinkedList<>();
        for (String s : list1) {
            for (String s2 : list2) {
                for (String s3 : list3) {
                    l.add(s + s2 + s3);
                }
            }
        }
        return l;
    }

    public static List<String> fourDigits(List<String> list1, List<String> list2, List<String> list3, List<String> list4) {
        List<String> l = new LinkedList<>();
        for (String s : list1) {
            for (String s2 : list2) {
                for (String s3 : list3) {
                    for (String s4 : list4) {
                        l.add(s + s2+s3+s4);
                    }
                }
            }
        }
        return l;
    }
}
