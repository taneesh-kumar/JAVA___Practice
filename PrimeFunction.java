import java.util.*;

public class PrimeFunction {
    public static  void CalculatePrime(int a){
        int divisible = 1;
        for(int i=2; i<a; i++){
            if( a%i == 0){
                divisible++;
            }
        }
        if(a == 1){
            System.out.println("1 is neither prime nor composit");
        } else if( divisible == 1){
            System.out.println(a+" is prime");
        } else {
            System.out.println(a+" is not prime / Composit");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        CalculatePrime(a);
    } 
}