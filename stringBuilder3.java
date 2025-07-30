import java.util.*;
public class stringBuilder3 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your Email : ");
        String email = sc.nextLine();

        if (email.isEmpty()) {
            System.out.println("Enter valid email");
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                sb.append(email.charAt(i));
            }
        }
        System.out.println("User name : "+sb.toString());
    }   
}
