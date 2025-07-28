/**
* @author Brent Barrows
*/

import java.util.Scanner;

public class BridgeToll520 {
    
    public static void main(String[] args) {
        
        // Start with the following code
        
        Scanner keyboard = new Scanner(System.in);
        try {
        // user input
            System.out.print("Hours (1-12) => ");
            int h = keyboard.nextInt();

            // Validate hours
            if (h < 1 || h > 12) {
                System.out.println("ERROR: Hours must be between 1 and 12.");
                return; // Exit the program
            }

            System.out.print("Minutes (0-59) => ");
            int min = keyboard.nextInt();

            // Validate minutes
            if (min < 0 || min > 59) {
                System.out.println("ERROR: Minutes must be between 0 and 59.");
                return; // Exit the program
            }

        keyboard.nextLine(); // consuming "\n" left in keyboard buffer
 
        System.out.print("am or pm (lower case only) => ");
        String amPm = keyboard.nextLine();

        double toll; // -1 was the placeholder for the actual value to be calculated 
        //(this is not needed in this case and seemed to be a bit confusing to the compiler when I ran it until changing it from placeholder -1 to  this when debugging)
        
        // Convert to 24-hour format for easier comparisons, thank you for the suggestion Professor
        if (amPm.equals("pm") && h != 12) {
            h += 12;
        } else if (amPm.equals("am") && h == 12) {
            h = 0;
        }

        
        // Determine toll based on time range
        if (h >= 0 && h < 5) {
            toll = 1.25;
        } else if (h >= 5 && h < 8) {
            toll = 1.40;
        } else if (h >= 8 && h < 11) {
            toll = 2.05;
        } else if (h >= 11 && h < 18) {
            toll = 2.65;
        } else if (h >= 18 && h < 21) {
            toll = 2.05;
        } else if (h >= 21 && h < 23) {
            toll = 1.40;
        } else {
            toll = 1.25;
        }

        
        System.out.printf("\nTimestamp: %d:%02d %s\nCharge: $%.2f\n", h, min, amPm, toll);
        
    } finally {
        keyboard.close(); // Ensure the Scanner is closed
  }
 }
}