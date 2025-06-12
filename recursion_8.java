public class recursion_8 {

    static int first = -1;
    static int last = -1;

    public static void findInd(String str, int idx, char ele){
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if (str.charAt(idx) == ele) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        findInd(str, idx+1, ele);
    }

    public static void main(String[] args) {
        String str = "abcdefghia";
        findInd(str, 0, 'a');
    }
}