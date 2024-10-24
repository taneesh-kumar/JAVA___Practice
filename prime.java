import java.util.*;

public class main {
    public static boolean IsPrime(int num){
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num%2 == 0 || num%3 == 0) {
            return false;
        }
        for(int i=5; i*i<=num; i+=6){
            if (num%i == 0 || num%(i+2) == 0 ) {
                return false;
            }
        }
        return true;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();

        if (IsPrime(n)) {
            System.out.println(n+" ia a prime");
        }
        else{
            System.out.println(n+" is not prime");
        }
    }
}