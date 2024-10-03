import java.util.*;

public class AscendingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int size = sc.nextInt();
        int [] num = new int[size];

        System.out.println("array entry");
        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }

        boolean IsAscending = true;
        
        for(int i=0; i<size-1; i++){
            if (num[i] > num[i+1]) {
                IsAscending = false;
            }
        }

        if (IsAscending == true) {
            System.out.println("Array is Ascending");
        } 
        else{
            System.out.println("Array is not Ascending");
        }


    }
}