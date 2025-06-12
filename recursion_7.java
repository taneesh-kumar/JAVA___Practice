public class recursion_7 {
    public static void revStr(String str, int index){
        if (index < 0) {
            return;
        }
        System.out.print(str.charAt(index)+" ");
        revStr(str, index-1);
    }

    public static void main(String[] args) {
        String str = "Taneesh";
        revStr(str, str.length()-1);
    }
}
