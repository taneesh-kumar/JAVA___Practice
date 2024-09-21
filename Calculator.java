import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Both numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Choose Operarion");
        System.out.println("Add enter[1]");
        System.out.println("Sub enter[2]");
        System.out.println("mul enter[3]");
        System.out.println("div enter[4]");

        int n = sc.nextInt();
        
        switch (n) {
            case 1: System.out.println(a + b);
            break;
            case 2: System.out.println(a - b);
            break;
            case 3: System.out.println(a * b);
            break;
            case 4: if(b == 0){
                System.out.println("Calculation Undefined");
            }else{
                System.out.println(a / b);
            }
            break;
        }
        
    }
}