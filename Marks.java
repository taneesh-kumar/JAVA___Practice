import java.util.*;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.println("Enter your marks");
            int n = sc.nextInt();
            if (n >= 90){
                System.out.println("This is good");
            } else if(n >= 60 && n <=89){
                System.out.println("This is also good");
            } else if (n>=0 && n<=59){
                System.out.println("This is good as well");
            } else{
                System.out.println("Enter valid marks");
            }
            System.out.println("Want to recheck?\nif yes[1]\nno[0]");
            input = sc.nextInt();
        } while(input == 1);
    }    
}