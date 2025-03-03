public class recursion_3 {
    public static void CalFac(int n, int Fac){
        if (n <= 0) {
            System.out.println(Fac);
            return;
        }
        Fac *= n;
        CalFac(n-1, Fac);
    }

    public static void main(String[] args) {
        CalFac(5, 1);
    }
}
