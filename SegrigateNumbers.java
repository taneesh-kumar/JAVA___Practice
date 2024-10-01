import java.util.*;

public class SegrigateNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.println("How many numbers do you want to enter?");
            int numbers = sc.nextInt();
            System.out.println("Enter your numbers");
            int positive = 0;
            int zeros = 0;
            int negitives = 0;
            for(int i=1; i<=numbers; i++){
                int n = sc.nextInt();
                if(n>0){
                    positive++;
                } else if(n == 0){
                    zeros++;
                } else if(n<0){
                    negitives++;
                } else{
                    System.out.println("Invalid entry\n only Intergers are allowed");
                }
            }
            System.out.println("There are "+positive+" Positive nubers");
            System.out.println("There are "+zeros+" Zeros");
            System.out.println("There are "+negitives+" negitive nubers");
            System.out.println("Want to re-Enter? yes[1] no[0]");
            input = sc.nextInt();
        } while( input == 1);
    }
}