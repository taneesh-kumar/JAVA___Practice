import java.util.*;

public class prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do{
        System.out.println("Enter number");
        int n = sc.nextInt();
        int div = 0;
        for (int i=2; i<n; i++){
           if(n % i == 0){
            div++;
           }
        }
        if (n == 1){
            System.out.println("1 is neither prime nor composit");
        } else if(div == 0){
            System.out.println(n+" is prime");
        } else {
            System.out.println(n+" is not prime");
        }
        System.out.println("want to continue? yes[1] no[0]");
        input = sc.nextInt();
    }while(input == 1);
    }
}