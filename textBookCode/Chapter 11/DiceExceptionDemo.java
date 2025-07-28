/**
   This program demonstrates how the Die class throws
   an exception when an invalid value is passed to the
   constructor.
*/

public class DiceExceptionDemo
{
   public static void main(String[] args)
   {
      final int DIE_SIDES = 1;  // Number of sides
      
      // Create an instance of the Die class.
      //db: since this calling code does not have an 
      //exception handler, then if the calling code
      //throws an exception to us
      //then the stack trace will print out
      Die die = new Die(DIE_SIDES);
 
      //and with the exception code that happens
      //above the below code will never execute
      System.out.println("Initial value of the die:");
      System.out.println(die.getValue());
   }
}