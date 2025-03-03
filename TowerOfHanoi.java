public class TowerOfHanoi {
    public static void solveHanoi(int n, char source, char support, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        solveHanoi(n - 1, source, destination, support);
        
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        
        solveHanoi(n - 1, support, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;
        solveHanoi(n, 'A', 'B', 'C'); 
    }
}
