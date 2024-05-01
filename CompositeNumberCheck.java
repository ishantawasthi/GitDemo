package Loops;

import java.util.Scanner;

public class CompositeNumberCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  Number Which you want check :");
        int n=sc.nextInt();
        for(int i=1;i<n-1;i++){
          if(n%i==0)  System.out.println("Composite Number");   break;
        }
    }
}
