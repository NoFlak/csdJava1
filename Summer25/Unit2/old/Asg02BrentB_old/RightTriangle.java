/**
* @author Brent Barrows
*Sad to admit I spent most of my time working on this math tutor program although it mightve been working much earlier than I realized but the failed test made me redo a few things while scratching my head thuroughly.
*/
import java.util.Scanner;

public class RightTriangle {

    public static void main(String[] args) {
    
        // Start with the following code
        
        Scanner keyboard = new Scanner(System.in); //(14-04-25-23:13 Seems like runs fine but these gold squiggly lines are annoying and I dont know why they are popping up here. Still fails test
        System.out.print("Enter the size of the first side of the triangle => ");
        double a = keyboard.nextDouble();
  
        System.out.print("Enter the size of the second side of the triangle => ");
        double b = keyboard.nextDouble();
 
        System.out.print("Enter the size of the third side of the triangle => ");
        double c = keyboard.nextDouble();

        // Input validation: Check if any side is non-positive
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("ERROR: All sides must be positive numbers.");
            keyboard.close();
            return; // Exit the program
        }
        // Determine the longest side (hypotenuse)
        double hypotenuse = Math.max(a, Math.max(b, c));
        double side1, side2;

        if (hypotenuse == a) {
            side1 = b;
            side2 = c;
        } else if (hypotenuse == b) {
            side1 = a;
            side2 = c;
        } else {
            side1 = a;
            side2 = b;
        }

        // Check Pythagorean theorem
        double side1Squared = Math.pow(side1, 2);
        double side2Squared = Math.pow(side2, 2);
        double hypotenuseSquared = Math.pow(hypotenuse, 2);

        System.out.printf("Checking: %.1f^2 + %.1f^2 = %.1f^2%n", side1, side2, hypotenuse);
        System.out.printf("         %.1f + %.1f = %.1f%n", side1Squared, side2Squared, hypotenuseSquared); 

        // Check if it forms a right triangle
        if (side1Squared + side2Squared == hypotenuseSquared) {
            System.out.println("Yes, it forms a right triangle!");
        } else {
            System.out.println("No, it does not form a right triangle.");
        }

        keyboard.close();

    }
}
