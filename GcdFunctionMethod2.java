import java.util.*;

public class GcdFunctionMethod2 {
    public static int CalculateGcd(int a, int b){
        if(a%b == 0){
            return b;
        }else {
            return CalculateGcd(b, a%b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Divident");
        int a = sc.nextInt();
        System.out.println("Enter Divisor");
        int b = sc.nextInt();

        System.out.println(CalculateGcd(a, b));
    }
}