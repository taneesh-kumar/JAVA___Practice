import java.util.*;
public class recursion_13 {
    public static void findSubSeq(int index, String str, String newString, HashSet<String> set){
        if (index == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                set.add(newString);
                System.out.println(newString);
                return;
            }
        }
        char curr = str.charAt(index);
        findSubSeq(index+1, str, newString+curr, set);

        findSubSeq(index+1, str, newString, set);
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str = "aaa";
        findSubSeq(0, str, "", set);
    }
}
