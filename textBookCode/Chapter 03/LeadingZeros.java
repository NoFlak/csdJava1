/**
   This program displays floating-point numbers padded with leading zeros
   using formatted output. It also demonstrates how the formatting behaves
   when a number exceeds the specified field width.
*/

public class LeadingZeros {
   public static void main(String[] args) {
      // Declare a variety of double variables.
      double number1 = 1.234;
      double number2 = 12.345;
      double number3 = 123.456;

      // DB: Added this number to test what happens when the value exceeds the field width
      double number4 = 123456789.456;

      /*
         Each line below uses the format specifier %09.2f:

         - '9' = minimum field width of 9 characters
         - '.2' = 2 digits after the decimal point
         - '0' = pad unused space with leading zeros

         IMPORTANT:
         If the formatted number is shorter than 9 characters,
         leading zeros will be added to fill the field.

         BUT:
         If the formatted number is longer than 9 characters,
         Java will ignore the field width and print the full number as-is.
         It will NOT truncate or throw an error.

         This is a great example of how Java prioritizes correct output over strict formatting.
      */

      System.out.printf("%09.2f\n", number1);       // Prints: 000001.23
      System.out.printf("%09.2f\n", number2);       // Prints: 000012.35
      System.out.printf("%09.2f\n", number3);       // Prints: 000123.46

      // DB: This number exceeds the 9-character width → field expands automatically
      System.out.printf("%09.2f\n", number4);       // Prints: 123456789.46 (no zero padding)
   }
}
