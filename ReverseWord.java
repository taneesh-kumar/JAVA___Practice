import java.util.*;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.next();
        StringBuilder sb = new StringBuilder(word);

        for(int i=0; i<sb.length()/2; i++){
            int frount = i;
            int back = sb.length()-1-i;

            char frountCharecter = sb.charAt(frount);
            char backCharecter = sb.charAt(back);

            sb.setCharAt(frount, backCharecter);
            sb.setCharAt(back, frountCharecter);
        }
        System.out.println(sb);
    }
}