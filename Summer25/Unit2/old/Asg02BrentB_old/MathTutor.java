import java.util.Random;
import java.util.Scanner;

/**
* @author Brent Barrows
* This program is a simple math tutor that quizzes the user on addition or subtraction problems.
* Helpful references:
* - https://docs.oracle.com/javase/tutorial/java/javaOO/exception/index.html
* - https://docs.oracle.com/javase/tutorial/java/javaOO/constructors/index.html
* - https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
* - https://docs.oracle.com/javase/tutorial/essential/exceptions/finally.html
*/

public class MathTutor {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); // correct usage of Random

        try {
            // menu to select addition or subtraction
            System.out.println("Welcome to Math Tutor!");
            System.out.println("Select an option:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.print("Enter your choice (1 or 2): ");
            int choice = scanner.nextInt();

            // generate random numbers
            int num1 = random.nextInt(100) + 1; // Random number between 1 and 100
            int num2 = random.nextInt(100) + 1;

            // use switch to determine operation and correct answer if else if attempt failed
            String operation;
            switch (choice) {
                case 1 -> operation = "+";
                case 2 -> operation = "-";
                default -> {   //absolutely required to make the switch statement work, otherwise it would not compile
                    System.out.println("Invalid choice. Please restart the program.");
                    return; // exit the program for invalid input
                }
            }

            int correctAnswer = switch (choice) {
                case 1 -> num1 + num2;
                case 2 -> num1 - num2;
                default -> 0; // this case should never be reached due to the previous validation, but it's here for safety and because I dont understand why it didn't work before without it.
            };

            // display the problem
            System.out.printf("Solve: %d %s %d = ?\n", num1, operation, num2);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            // check the answer
            if (userAnswer == correctAnswer) {
                System.out.println("Correct! Great job!");
            } else {
                System.out.printf("Incorrect. The correct answer is %d.\n", correctAnswer);
            }
        } finally {
            scanner.close(); // close scanner and end try block
            System.out.println("Thank you for using Math Tutor! Goodbye!");
        }
    }
}