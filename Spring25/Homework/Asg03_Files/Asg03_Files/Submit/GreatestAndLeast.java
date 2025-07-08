import java.util.Scanner;
/**
* @author Brent Barrows
*Requirements:
* - Code must run correctly on the test cases.
* - DO NOT use arrays or ArrayLists to store the numbers in the series. Numbers must be analyzed on the spot and “discarded”.
* - Error message in response to negative value other than -99 must include the word ERROR to pass the tests.
* - “No numbers were entered” must appear when no numbers were entered.
* - When the user entered at least one integer other than -99, the report must:
*   -- List first the largest number, with the word “largest” preceding it.
*   --List the smallest number, with the word “smallest” preceding it.
*   -- See sample user interaction for formatting. This is important to pass the tests... and my repeating issues with the tests.
*/

public class GreatestAndLeast {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE; // Placeholder for the largest number
        int smallest = Integer.MAX_VALUE; // Placeholder for the smallest number
        boolean hasValidInput = false; // Flag to check if any valid numbers were entered    

        while (true) {
            System.out.print("Enter an integer (-99 to stop): ");
            if (scanner.hasNextInt()) { // Check if the input is a valid integer
                int num = scanner.nextInt(); // Read the integer

                if (num == -99) { // Check for termination condition
                    break; // Exit the loop
                } else if (num < 0) { // Check for negative numbers
                    System.out.println("ERROR: Negative number entered. Please enter a positive integer or -99 to stop.");
                } else { // Valid positive number
                    hasValidInput = true; // Set flag to true since we have a valid input

                    if (num > largest) { // Update largest number
                        largest = num;
                    }
                    if (num < smallest) { // Update smallest number
                        smallest = num;
                    }
                }
            } else {
                System.out.println("ERROR: Invalid input. Please enter an integer."); // Error message for invalid input
                scanner.next(); // Clear invalid input
            }
        }

        // Final output
        if (hasValidInput) {
            System.out.println("largest: " + largest);
            System.out.println("smallest: " + smallest);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close(); // Close the scanner to release resources
    }
}
