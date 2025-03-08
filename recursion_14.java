public class recursion_14 {
    static String [] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printCombi(int index, String str, String combination){
        if (index == str.length()) {
            System.out.println(combination);
            return;
        }
        char curr = str.charAt(index);
        String mapping = keypad[curr - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printCombi(index+1, str, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "4";
        printCombi(0, str, "");
    }
}
