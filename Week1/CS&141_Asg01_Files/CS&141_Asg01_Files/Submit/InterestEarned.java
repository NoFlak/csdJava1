/**
* @author Brent Barrows
* Requirements:
* 1. Declare a double constant INTEREST_RATE to hold 0.05. [Complete]
* 2. Use try-with-resources to manage the Scanner. [Complete]
* 3. Prompt the user to enter the principal amount. [Complete]
* 4. Input the principal amount and store it in a variable. [Complete]
* 5. Calculate the interest earned. [Complete]
* 6. Output the principal amount and interest earned. [Complete]
* 7. Prompt the user to enter the interest rate and time. [Complete]
* 8. Calculate the interest earned using the formula: Interest = Principal * Rate * Time. [Complete]
* 9. Output the principal, rate, time, interest earned, and total amount. [Complete]
*/

import java.util.Scanner;
public class InterestEarned {
    public static void main(String[] args) { 
    // write your code here
    // 1. Declare double constant INTEREST_RATE to hold 0.05
        final double INTEREST_RATE = 0.05;
        
        // 2. Use try-with-resources to manage the Scanner, issue #2 never existed returning to the original code and running from file locationw as actual issue likely.
        try (Scanner scanner = new Scanner(System.in)) {
            // 3. Prompt the user to enter principal amount
            System.out.print("Enter the principal amount: ");
            
            // 4. Input principal amount and store it in variable
            double principalAmount = scanner.nextDouble();
            
            // 7. Prompt the user to enter the interest rate and time
            System.out.print("Enter the annual interest rate (in %): ");
            double annualRate = scanner.nextDouble();
            
            System.out.print("Enter the time (in years): ");
            double time = scanner.nextDouble();
            
            // 8. Calculate the interest earned using the formula
            double rate = annualRate / 100; // Convert percentage to decimal
            double interestEarned = principalAmount * rate * time;
            double totalAmount = principalAmount + interestEarned;
            
            // 9. Output the principal, rate, time, interest earned, and total amount
            System.out.printf("Principal: %.2f\n", principalAmount);
            System.out.printf("Rate: %.2f%%\n", annualRate);
            System.out.printf("Time: %.2f years\n", time);
            System.out.printf("Interest Earned: %.2f\n", interestEarned);
            System.out.printf("Total Amount: %.2f\n", totalAmount);
        } 
   }  
}

