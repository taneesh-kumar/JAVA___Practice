public class recursion_11 {

    static boolean map[] = new boolean[26];

    public static void remDup(int index, String str, String newString){
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(index);
        if (map[curr - 'a']) {
            remDup(index+1, str, newString);
        } else {
            newString += curr;
            map[curr-'a'] = true;
            remDup(index+1, str, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        remDup(0, str, "");
    }
}