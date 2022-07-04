package Soutions;

public class CommonPrefix {
    // الفكرة اني هاخد اول كلمة واعتبرها هي ال Prefix
    // وهبدا انقص منها على حسب الحروف المختلفة بين كل كلمة والتانية
    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                // Cut the String from the End ....!!!
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    /*
    prefix = flower
    [flow,flight]
    flower
    flow**

    flow.indexOf(flower) !=0
    prefix= flowe(r)
          X

    flow.indexOf(flowe) !=0
    prefix= flow(e)
         X

    flow.indexOf(flow) == 0 DONE...!!!
    ------------
    prefix = flow (Common with Flower - Flow )
    ------------

    flight.indexOf(flow) !=0
    prefix= flo(w)
                X

    flight.indexOf(flo) !=0
    prefix= fl(o)
               X

    flight.indexOf(fl) ==0 DONE...!!!

    prefix= fl Common with [flower - flow -flight]

     */

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
