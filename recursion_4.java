public class recursion_4 {

    public static void fibSeries(int a, int b, int n){
        if (n == 0) {
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibSeries(b, c, n-1);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int num = 10;

        fibSeries(a, b, num-2);
    }
}