import java.util.*;

public class ExtremesInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int [] extreme = new int[size];

        System.out.println("Enter values");
        for(int i=0; i<size; i++){
            extreme[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<size; i++){
            if(extreme[i] < min){
                min = extreme[i];
            }
            if(max < extreme[i]){
                max = extreme[i];
            }
        }
        System.out.println("Max value : "+max);
        System.out.println("Min value : "+min);
    }    
}