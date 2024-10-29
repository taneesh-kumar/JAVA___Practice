import java.util.*;

public class ArrayStringTotalLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();

        String [] length = new String[size];

        int TotalLength = 0; 
        
        for(int i=0; i<size; i++){
            length[i] = sc.next();
            TotalLength += length[i].length();
        }

        System.out.println("total array length is : "+TotalLength);
    }    
}