import java.util.*;

public class GcdFunctionMethod1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter divident");
    int divident = sc.nextInt();
    System.out.println("Enter divisor");
    int divisor = sc.nextInt();
    
    while (divident % divisor != 0) {
        divident = divisor;
        int r = divident % divisor;
        divisor = r;
        }
        System.out.println("GCD is :"+divisor);
    }    
}