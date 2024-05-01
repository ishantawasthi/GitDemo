package Conditionals;

import java.util.Scanner;

public class ThreeNumber_greatest_Them {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number  :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&b>c) System.out.println(a+"  is largest");
        else if(b>a&&a>c) System.out.println(b+" is largest");
        else System.out.println(c+" is  largest ");



    }
}
