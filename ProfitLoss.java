package Conditionals;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the selling price :");
        int sp=sc.nextInt();
        System.out.println("Enter the cost price :");
        int cp=sc.nextInt();
        if(sp>cp) System.out.println("profit is "+ (sp-cp));
         if(cp>sp) System.out.println("loss is "+(cp-sp));
         if(cp==sp) System.out.println("No profit , No loss");
    }
}
