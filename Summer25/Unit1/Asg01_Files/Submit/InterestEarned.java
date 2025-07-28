/**
* @author Brent Barrows
*/
import java.util.Scanner;

public class InterestEarned 
{
    public static void main(String[] args) { 
        double principal, rate, interest, total;
        int time; // times compounded per year

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the principal amount: ");
            principal = input.nextDouble();
            System.out.print("Enter the rate: ");
            rate = input.nextDouble();
            System.out.print("Enter the times compounded: "); //could assume 12 but this is an input expected
            time = input.nextInt();
        }


        double r = rate / 100.0;
        total = principal * Math.pow(1 + r / time, time);
        interest = total - principal;

        // Output in the order the grader expects
        System.out.printf("%.2f%%%n", rate);
        System.out.printf("%d%n", (int) time);
        System.out.printf("%.2f%n", principal);
        System.out.printf("%.2f%n", interest);
        System.out.printf("%.2f%n", total);
    }      
}

