import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0; int b = 1;
        System.out.println("Series Length");
        int n = sc.nextInt();
        System.out.print(a+" ");
        for(int i=2; i<=n; i++){
            System.out.print(b+" ");
            int temp = a+b;
            a = b;
            b = temp;
        }
    }
}