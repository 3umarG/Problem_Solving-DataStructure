package Soutions;

public class LengthOfLongestSubString {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("GEEKSFORGEEKS"));
    }


    public static int lengthOfLongestSubstring(String s) {
        // 1.length=0
        if(s.length()==0){
            return 0;
        }

        // 2.All Chars are equal
        if(isAllCharEquals(s)){
            return 1;
        }

        // 3.All Chars are Different
        if(isAllCharDiff(s)){
            return s.length();
        }


        // 4.There are Repeating
        int i,j,c,length,max=0;
        //boolean isTrue;
        // Start
        for( i=0;i<s.length()-1;i++){
            // Character Adding (end)...
            loop:
            for(j=i+1;j<s.length();j++){
            length=0;
                //isTrue=true;
                // Condition
                for(c=i;c<j;c++){
                    if(s.charAt(c)==s.charAt(j)){
                       // isTrue=false;
                        break loop;
                    }
                }
            }
            length=j-i;///
            max=Math.max(max,length);
        }
        return max;
    }

    public static boolean isAllCharEquals(String s){
        char c= s.charAt(0);
        for (int i = 1; i <s.length() ; i++) {
            if (s.charAt(i)!=c){
                return false;
            }
        }
        return true;
    }

    public static boolean isAllCharDiff(String s){
        for (int i=0;i<s.length()-1;i++){
            for (int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
