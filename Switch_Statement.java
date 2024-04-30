package Conditionals;

import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the value of a and b with operator :");
        int a= sc.nextInt();
        char op= sc.next().charAt(0);
        int b= sc.nextInt();

        switch (op){

            case '+' :
                System.out.println(a+b); break;
            case '-' :
                System.out.println(a-b); break;
            case '*' :
                System.out.println(a*b);  break;

            case '/' :
                System.out.println(a/b);  break;








        }

    }
}
