import java.util.*;

public class CumulativeLengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size?");
        int size = sc.nextInt();
        String Array[] = new String[size];

        System.out.println("Array input");
        for(int i=0; i<size; i++){
            Array[i] = sc.nextLine();
        }
    }    
}