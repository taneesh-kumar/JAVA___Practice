import java.util.*;

public class stringBuilder2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");

        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e' || str.charAt(i) == 'E') {
                sb.append('i');
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println("Modified String : "+sb.toString());
    }

}