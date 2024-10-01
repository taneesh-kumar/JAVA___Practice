import java.util.*;

public class PrintOddNumFunction {
    public static void PrintOddNum(int n){
        for(int i=1; i<=n; i++){
            if( i%2 != 0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.println("Enter the number");
            int n = sc.nextInt();
            PrintOddNum(n);
            System.out.println();
            System.out.println("Wanna re-check? \nyes[1] no[0]");
            input = sc.nextInt();
        } while( input == 1);
    }
}