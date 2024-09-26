//Pascal's Triangle
//    1
//   1 1
//  1 2 1
// 1 3 3 1
//1 4 6 4 1
import java.util.*;

public class AdvPatternProb7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
    do{
        System.out.println("Enter Number of rows");
        int r = sc.nextInt();

        for(int i=0; i<r; i++){
            for(int j=r-i; j>0; j--){
                System.out.print(" ");
            }
            int num = 1;
            for(int j=0; j<=i; j++){
                System.out.print(num+" ");
                num = num*(i-j)/(j+1);
            }
            System.out.println();
        }
        System.out.println("Want to continue? yes[1] no[0]");
        input = sc.nextInt();
      }while(input == 1);   
    }
}