package Conditionals;
import java.util.*;
public class Absolute_value {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number :");
        int x=sc.nextInt();
        if(x<0) System.out.println(-x);
        else System.out.println(x);
    }
}
