public class recursion_1 {

    public static void PrintNum(int n){
        if (n > 10){
            return;
        }
        System.out.println(n);
        PrintNum(n+1);
    }

    public static void main(String[] args) {
        int num = 1;

        PrintNum(num);
    }
}