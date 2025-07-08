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

      /** Input validation loop:
      * if the requirement was for more error handling please let me know in your grading sorry for my misunderstanding if so--
      * --I was thinking it would be good practice adding div by zero handling as well as alphabet errors seperately for user friendliness beyond just the invalid input.
      * I also thought about adding a loop to allow the user to enter multiple numbers but I wasn't sure if that was in scope for this assignment.
      * But decided to keep it simple and just do the one number as per the requirements to avoid downgraded points for going outside the scope of the assignment.
      */ 
      while (!validInput) {
         System.out.print("Enter an integer => ");
         if (kb.hasNextInt()) { // Check if the input is a valid integer
            num = kb.nextInt(); // Read the integer
            validInput = true; // Exit the loop
         } else {
            System.out.println("ERROR: Invalid input. Please enter an integer.");// Error message for invalid input looping back to prompt
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
      // Close the Scanner to prevent 'leaving the barn door open' as Sandy would say
      kb.close();
	}

}
