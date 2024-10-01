// In-Efficient
import java.util.*;

public class GcdFunctionMethod3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter divident");
        int a = sc.nextInt();
        System.out.println("Enter divisor");
        int b = sc.nextInt();
        int n = 0;
        
        for(int i=1; i<=b; i++){
            if (a%i == 0 && b%i == 0) {
                n = i;
            }
        }
        System.out.println("GCD is : "+n);
    }    
}