package Loops;
import java.util.*;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the Number ");
        int n=sc.nextInt();

        int sum =0;
        while(n!=0){
            int LD= n%10;
            sum+=LD;
            n=n/10;
        }
        System.out.println(sum);
    }
}
