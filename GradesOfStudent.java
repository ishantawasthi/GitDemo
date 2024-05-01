package Conditionals;

import java.util.Scanner;

public class GradesOfStudent {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the Percentage of Student :");
        int n=sc.nextInt();
        if(n<100&&n>=81) System.out.println("VERY GOOD!");
        else if(n>60&&n<=80) System.out.println("GOOD!");
        else if(n<60&&n>=41) System.out.println("AVERAGE !");
        else  System.out.println("FAIL!");
    }
}
