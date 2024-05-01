package Conditionals;

import java.util.Scanner;

public class Check_TriangleSides {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the sides of triangle :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a+b)>c&&(b+c)>a&&(c+a)>b) System.out.println( " 3 Number are sides of triangle ");
        else System.out.println(" 3 Number are not sides of triangle ");
    }
}
