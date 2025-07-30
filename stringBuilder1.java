import java.util.*;

public class stringBuilder1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of strings : ");
        int n = sc.nextInt();
        sc.nextLine();

        /*After reading int n = sc.nextInt();, Java doesn’t consume the newline character (\n) that’s left in the input buffer. So when sc.nextLine() is called next, it immediately reads an empty line.*/

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter String "+(i+1)+" : ");
            String inp = sc.nextLine();
            sb.append(inp);
        }

        System.out.println("The Combined String is : "+sb.toString());
        System.out.println("The Length of String is : "+sb.length());
    }

}