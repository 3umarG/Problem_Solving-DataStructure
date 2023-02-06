package Soutions.recursion;

public class Pow {
    public static void main(String[] args) {
        System.out.println(myPow(2
                , 4));
    }

    public static double myPow(double x, int n) {
        double result = helper(x, Math.abs(n));
        if (n >= 0) return result;
        else return 1 / result;
    }

    public static double helper(double x, int n) {
        if (n == 0 || x == 1) return 1;
        if (n == 1) return x;
        if (x == 0.0) return 0;

        if (n % 2 == 0)
            return myPow(x * x, n / 2);
        else
            return x * myPow(x * x, n / 2);
    }

    public static double myPow2(double x, int n) {
        if (n == 0 || x == 1)
            return 1;
        if (x == 0)
            return 0;

        if (n < 0)
            return myPow(1 / x, Math.abs(n));

        return (n % 2 == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2));
    }
}
