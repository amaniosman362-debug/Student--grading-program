
package vu.saccoinvestmentwhile;
import java.util.Scanner;

public class SaccoInvestmentWhile {
    public static void main(String[] args) {
        Scanner save = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = save.nextInt();
        int i = 1;

        while (i <= n) {
            System.out.println("\nTeacher " + i);
            System.out.print("Enter principal amount: ");
            double principal = save.nextDouble();

            System.out.print("Enter time in years: ");
            int time = save.nextInt();

            double value = principal * (1 + 0.05 * time);
            System.out.println("Value of investment after " + time + " years = " + value);

            i++;
        }

       
    }
}

