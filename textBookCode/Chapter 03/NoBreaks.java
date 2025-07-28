import java.util.Scanner;    // Needed for Scanner class

/**
   This program demonstrates the switch statement.
*/

public class NoBreaks
{
   public static void main(String[] args)
   {
      int number;       // A number entered by the user
          
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get one of the numbers 1, 2, or 3 from the user.
      System.out.print("Enter 1, 2, or 3: ");
      number = keyboard.nextInt();

		//DB:
		// Without break statements under each case,
		// the switch statement exhibits classic "fall-through" behavior.
		// For example, if we enter a value of 1:
		// Java matches case 1 and then continues executing
		// all subsequent cases and the default block — regardless of their labels.
      switch (number)
      {
         case 1:
            System.out.println("You entered 1.");
         case 2:
            System.out.println("You entered 2.");
         case 3:
            System.out.println("You entered 3.");
         default:
            System.out.println("That's not 1, 2, or 3!");
      }
      //db: added to close the scanner as a resource
      keyboard.close();
	  
	  /*DB
	  Here is a contrast with the break statement
	  switch (number)
      {
         case 1:
            System.out.println("You entered 1.");
			break;
         case 2:
            System.out.println("You entered 2.");
			break;
         case 3:
            System.out.println("You entered 3.");
			break;
         default:
            System.out.println("That's not 1, 2, or 3!");
      }
      //db: added to close the scanner as a resource
      keyboard.close();
	  */
   }
}
