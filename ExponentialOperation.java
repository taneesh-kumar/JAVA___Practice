import java.util.*;

public class ExponentialOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.println("Enter the base number");
            int base = sc.nextInt();
            System.out.println("Enter the power");
            int power = sc.nextInt();
            int ans = 1;
            for(int i=1; i<=power; i++){
                ans = ans*base;
            }
            System.out.println(base+" power "+power+ " is "+ ans);
            System.out.println("Want to redo? yes[1] no[0]");
            input = sc.nextInt();
        } while(input == 1);
    }    
}