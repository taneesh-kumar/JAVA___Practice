public class recursion_2 {
    public static void calSum(int i, int n, int sum){
        if (i>n) {
            System.out.println(sum);
            return;
        }
        sum += i;
        calSum(i+1, n, sum);
    }

    public static void main(String[] args) {
        calSum(1, 10, 0);
    }
}
