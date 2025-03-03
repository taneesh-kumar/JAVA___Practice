public class recursion_10 {
    public static void shuffleString(String str, int index, int count, String newString){
        if (index == str.length()-1){
            for (int i = 0; i <= count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        if (str.charAt(index) == 'x') {
            count++;
            shuffleString(str, index+1, count, newString);
        } else {
            newString += str.charAt(index);
            shuffleString(str, index+1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbjxxitscxyzwx";
        shuffleString(str, 0, 0, "");
    }
}
