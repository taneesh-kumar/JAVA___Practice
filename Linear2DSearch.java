import java.util.*;

public class Linear2DSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter rows");
        int rows = sc.nextInt();
        
        System.out.println("Enter colms");
        int colms = sc.nextInt();
        
        int[][] num = new int[rows][colms];

        System.out.println("2D array input");
        for(int i=0; i<rows; i++){
            for(int j=0; j<colms; j++){
                num[i][j] = sc.nextInt();
            }
        }

        System.out.println("What do you want to search");
        int x = sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<colms; j++){
                if (num[i][j] == x) {
                    System.out.println(x+" found at ("+i+","+j+")");
                }
            }
        }

    }    
}