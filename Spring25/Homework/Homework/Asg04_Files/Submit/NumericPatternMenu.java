import java.util.Scanner;

/**
* @author Brent Barrows
*/
public class NumericPatternMenu {

    /**
     * Validates user input to ensure it is an integer
     * @param prompt message to display to user
     * @param keyboard Scanner object for input
     * @return validated integer value
     */
    public static int validateInt(String prompt, Scanner keyboard) {
        while (true) {
            System.out.print(prompt);
            try {
                return keyboard.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR. Number entered is not an integer.");
                keyboard.next(); // Clear invalid input
            }
        }
    }

    /**
     * Generates a numeric pattern based on size and direction
     * @param size defines size of pattern (must be positive)
     * @param direction true for ascending (12321), false for descending (32123)
     * @return pattern string
     * @throws IllegalArgumentException if size <= 0
     */
    public static String numericPattern(int size, boolean direction) throws IllegalArgumentException {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be positive");
        }

        StringBuilder pattern = new StringBuilder();
        if (direction) {
            for (int i = 1; i <= size; i++) pattern.append(i);
            for (int i = size - 1; i >= 1; i--) pattern.append(i);
        } else {
            for (int i = size; i >= 1; i--) pattern.append(i);
            for (int i = 2; i <= size; i++) pattern.append(i);
        }
        return pattern.toString();
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        while (true) {
            // Display menu
            System.out.println("\nNumeric Pattern Display");
            System.out.println("1. Print Type I pattern (like 12321)");
            System.out.println("2. Print Type II pattern (like 32123)");
            System.out.println("3. Quit");
            
            // Get and validate menu choice
            int choice = validateInt("Enter your choice (1 - 3): ", keyboard);
            
            // Handle menu choice
            if (choice == 3) {
                System.out.println("Quitting!");
                break;
            } else if (choice == 1 || choice == 2) {
                // Get and validate pattern size
                int size;
                while (true) {
                    size = validateInt("Please enter the size of the pattern. The size must be a positive integer: ", keyboard);
                    if (size > 0) break;
                    System.out.println("ERROR. Number entered is not positive.");
                }
                
                // Generate and display pattern ((failed to catch error5/19/2025))FIXED with try-catch
                try {
                    System.out.println(numericPattern(size, choice == 1));
                } catch (IllegalArgumentException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            } else {
                System.out.println("ERROR. Number entered is not a valid selection.");
            }
        }
        keyboard.close();
    }
}
/**
 * Delete me before submission!
 * Notes:
 * - Remember what Dad says: "If it compiles, it works to some degree!"
 * - Come on future Brent, you can do better than that! Stay focused and keep improving.
 * - Keep adding notes and comments to your code to help you remember what you did and why.
 * Issue log :
 * 5/19/2025 - Fixed error handling for size validation - but might break, check last copy for original code if error occurs and revert.
 * 5/21/2025 - String builder used for pattern generation failed after refactoring, fixed by using StringBuilder loop instead of String concatenation
 */