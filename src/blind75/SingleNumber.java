package blind75;

public class SingleNumber {
    public static void main(String[] args) {

    }

    public static int singleNumber(int[] nums){
        // XOR :
        // XOR with Zero = the same number
        // a XOR a = 0
        // انت ضامن ان كده كده هيفضل ياخد قيمة الصفر لحد مايقابل رقم مش مكرر هيثبت عليه
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
