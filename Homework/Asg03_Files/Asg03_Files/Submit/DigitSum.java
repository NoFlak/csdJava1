import java.util.Scanner;
/**
* @author Brent Barrows
*Requirements:
*Write a program that inputs an integer number (either positive or negative), prints it out, then finds and prints out the sum of all digits in that number. 
*INPUT VALIDATION: If user enters a string that cannot be parsed into integer, the input must be rejected with an error message containing word ERROR and the prompt must be repeated.
*Do not use arrays in your solution. 
*Do not convert integer into a string in order to extract digits. Use % operator instead.
*/

public class DigitSum {

	public static void main(String[] args) {
      // start witht he following code. Add your code to solve the problem
      
		Scanner kb = new Scanner(System.in);  
      int num = 0; // Placeholder for the input number
      boolean validInput = false; // Flag to track if input is valid

        // Input validation loop
      while (!validInput) {
         System.out.print("Enter an integer => ");
         if (kb.hasNextInt()) { // Check if the input is a valid integer
            num = kb.nextInt(); // Read the integer
            validInput = true; // Exit the loop
         } else {
            System.out.println("ERROR: Invalid input. Please enter an integer.");
            kb.next(); // Clear invalid input
         }
      }
      int sum = 0; // placeholder
      int temp = Math.abs(num); // Work with the absolute value of the number

      while (temp > 0) {
         sum += temp % 10; // Extract the last digit and add to sum
         temp /= 10;       // Remove the last digit
      }

 		System.out.println("You entered number "+num+". The sum of its digits is "+sum);

	}

}
