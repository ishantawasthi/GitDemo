package Conditionals;

import java.util.Scanner;

public class NumberDivisibleby_3_or_5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number :");
        int n=sc.nextInt();
        if(n%3==0||n%5==0) System.out.println("Number divisible by 3,5");
        else System.out.println("Number not divisible by 3,5");


    }
}
