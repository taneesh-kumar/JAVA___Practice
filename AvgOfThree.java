import java.util.*;

public class AvgOfThree {
    public static void CalculateAverage(int a, int b, int c){
        int calculation = (a+b+c)/3;
        System.out.println(calculation);
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.println("Enter the numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.print("The average of the 3 is : ");CalculateAverage(a, b, c);
            System.out.println("want to continue? yes[1] no[0]");
            input = sc.nextInt();
        } while(input == 1);     
    } 
}