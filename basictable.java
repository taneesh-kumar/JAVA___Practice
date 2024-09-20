// Make a program that prints the table of a number that is input by the user. 
//HINT - You will have to write 10 lines for this but as we proceed in the course you will be studying about ‘LOOPS’ that will simplify your work A LOT!

import java.util.*;

public class basictable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("Table of "+n+" is :");
        System.out.println(n+ "*" + "1"+" = " +(n*1));
        System.out.println(n+ "*" + "2"+" = " +(n*2));
        System.out.println(n+ "*" + "3"+" = " +(n*3));
        System.out.println(n+ "*" + "4"+" = " +(n*4));
        System.out.println(n+ "*" + "5"+" = " +(n*5));
        System.out.println(n+ "*" + "6"+" = " +(n*6));
        System.out.println(n+ "*" + "7"+" = " +(n*7));
        System.out.println(n+ "*" + "8"+" = " +(n*8));
        System.out.println(n+ "*" + "9"+" = " +(n*9));
        System.out.println(n+ "*" + "10"+" = " +(n*10));

    }    
}
