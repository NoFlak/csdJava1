import java.util.Random;
import java.util.Scanner;

/**
* @author Brent Barrows
* Help from https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
* & https://www.w3schools.com/java/java_methods_param.asp
* & format help from https://www.geeksforgeeks.org/java/format-specifiers-in-java/
*/


 public class MathTutor
 {
    public static void main(String[] args) { 
     // write your code here
     //auto close scanner after block, but leave system intact
    try (Scanner input = new Scanner(System.in)) { 
            //declare variables
    int mathMenu=0, number1, number2, sum=0, userAnswer, top, bot; /* placeholder values added to handle init error*/
    char operator;
    Random randomNum = new Random();
        //print menu -adding while loop for breakpoint on 3
    while (mathMenu != 3) {
        System.out.print(
            "\nMath Tutor\n" +
            "1. Addition problem\n" +
            "2. Subtraction problem\n" +
            "3. Quit\n" +
            "Enter your choice (1 - 3): "
        );
    
        number1 = randomNum.nextInt(999);
        number2 = randomNum.nextInt(999);
        //sorting for formatting, I realize I can use math.min/max for this as well.
        if (number1 > number2){
            top = number1;
            bot = number2;
        } else {
            top = number2;
            bot = number1;
        }
        mathMenu = input.nextInt();
        //menu results leading to operator choice and equation print statement
        switch (mathMenu) {
            case 1:
                operator = '+';
                sum = top + bot;
                System.out.printf("  %4d\n%c %4d\n%s\n", top, operator, bot, "------\n");
                break;

            case 2:
                operator = '-';
                sum = top - bot;
                System.out.printf("  %4d\n%c %4d\n%s\n", top, operator, bot, "------\n");
                break;

            case 3:
                System.out.println("Goodbye");
                continue;

            default:
                System.out.println("Invalid, please user 1, 2, or 3.");
                continue;
        }

        //Take userAnswer and check against sum
        System.out.print("Your answer: ");
        if (input.hasNextInt()) { //wasnt sure if this input handling was also needed by the assignments listed requirements, but I hit the error on testing so here we are.
            userAnswer = input.nextInt();
            if (userAnswer == sum) {
                System.out.println("Correct! Well done.");
            } else {
                System.out.printf("Incorrect. The correct answer was %d.\n", sum);
            }
        } else {

    System.out.println("Invalid input. Please enter a number.");
    input.next(); // Consume the invalid input so it doesn't loop forever if you're using a loop
}
    }
    //auto close scanner with try-container after block end, but leave system intact. 
} 
    //method block end
}
  //class block end
}