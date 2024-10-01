//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.*;

public class AgeEligibilityFunction {
    public static void CheckAge(int a){
        if( a>= 18){
            System.out.println("You are an adult");
        } else{
            System.out.println("You are a minor");
        }
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.println("Enter age");
            int a = sc.nextInt();
            CheckAge(a);
            System.out.println("Want to recheck? \nyes[1] \nno[0]");
            input = sc.nextInt();
        } while( input == 1);
    } 
}