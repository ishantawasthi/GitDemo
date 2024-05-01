package Conditionals;

import java.util.Scanner;

public class Check_3digit_Number {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number  :");
        int n=sc.nextInt();
        if(n<1000&&n>99) System.out.println("Number have 3 digits ");
         else System.out.println("number have not 3 digits");
    }
}
