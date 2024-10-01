import java.util.*;

public class EvenOddFunction {
    public static void CheckEvenOrOdd(int n){
        if( n%2 == 0){
            System.out.println(n+" is even");
        } else{
            System.out.println(n+" is odd");
        }
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input ;
        do{
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        CheckEvenOrOdd(n);
        System.out.println("Want to continue? yes[1] no[0]");
        input = sc.nextInt();
        } while( input == 1);
    } 
}