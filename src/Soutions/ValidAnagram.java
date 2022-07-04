package Soutions;


public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
//Astronomer
        //  r
    }

    public static boolean isAnagram(String s, String t) {
        boolean isTrue = false;
        StringBuilder sS = new StringBuilder(s.toLowerCase());
        StringBuilder sT = new StringBuilder(t.toLowerCase());
        loop1:
        for (int i = 0; i < sT.length(); i++) {
            isTrue = false;
            for (int j = 0; j < sS.length(); j++) {
                if (sT.charAt(i) == sS.charAt(j)) {
                    sS.deleteCharAt(j);
                    isTrue = true;
                    continue loop1;
                }
            }
            if(!isTrue){
                return false;
            }
        }
        return sS.isEmpty() || sS.toString().isBlank();
    }
}
