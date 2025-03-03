public class recursion_6 {
    public static double calPower(int m, int n) {
        if (n == 0) return 1; 

        if (n < 0) return 1.0 / calPower(m, -n); 

        double halfPower = calPower(m, n / 2);

        if (n % 2 == 0) {
            return halfPower * halfPower; // If even, (x^n/2) * (x^n/2)
        } else {
            return m * halfPower * halfPower; // If odd, multiply by x once more
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int pow = 10;

        System.out.println(x + "^" + pow + " = " + calPower(x, pow));
    }
}
