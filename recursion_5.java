public class recursion_5 {
    public static double calPower(int m, int n) {
        if (n == 0) {
            return 1; // Base case: x^0 = 1
        }

        if (n < 0) {
            return 1.0 / calPower(m, -n); // Handle negative exponents
        }

        return m * calPower(m, n - 1); // Recursive case
    }

    public static void main(String[] args) {
        int x = 2;
        int pow = -3; // Testing negative exponent case

        System.out.println(x + "^" + pow + " = " + calPower(x, pow));
    }
}
