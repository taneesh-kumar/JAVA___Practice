public class recursion_12 {
    public static void findSubSeq(int index, String str, String newString){
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(index);
        findSubSeq(index+1, str, newString+curr);

        findSubSeq(index+1, str, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubSeq(0, str, "");
    }
}
